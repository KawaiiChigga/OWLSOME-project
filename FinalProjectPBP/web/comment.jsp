<%-- 
    Document   : comment
    Created on : Feb 22, 2017, 4:34:13 PM
    Author     : Kevin
--%>

<%@page import="model.Users"%>
<%@page import="model.Votes"%>
<%@page import="model.Comments"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collections"%>
<%@page import="model.Posts"%>
<%@page import="controller.DataAkses"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Comment</title>
    </head>
    <body>
        <%

            String name = (String) session.getAttribute("username");
        %>
        <%@ include file="header.jsp" %>
        <%            int idpost = -1;
            if (request.getParameter("post") != null) {
                idpost = Integer.parseInt(request.getParameter("post"));

            }

        %>

       

        <%
            Boolean available = true;
            DataAkses da = new DataAkses();
            ArrayList<Posts> data = da.getPost(idpost);
            ArrayList<Users> u = da.getUser(name);
            if (data.isEmpty() || idpost == -1) {
                available = false;
        %>
        <h1>POST NOT FOUND!!!</h1>
        <%
        } else {
            Posts temp = data.get(0);
        %> <h1>Title = <%=temp.getTitle()%></h1><%
            String nama = da.getUser(temp.getUsers().getIdUser()).get(0).getName();

            out.print("<span style='font-family:Trebuchet MS; color: #193149'><br><hr>");

            out.print("<h2>" + nama + "</h2>");
            out.print("<p style='font-size:20px;'>===== " + temp.getTitle() + " =====</p>");

            out.print("<p style='font-size:14px;'> " + temp.getContent() + "</p>");
            out.print("<p style='font-size:11px;'> Post Type: " + temp.getPostType() + " | Date: " + temp.getPostDate() + "</p><br><br>");
            out.println("<hr></span>");

            boolean ada = false;
            ArrayList<Votes> votes = da.getVotePost(temp.getIdPost());
            int j = 0;
            int like = 0, dislike = 0;

            for (int k = 0; k < votes.size(); k++) {
                if (votes.get(k).getVote() == 1) {
                    like++;
                } else {
                    dislike++;
                }
                if (!u.isEmpty()) {

                    if (votes.get(k).getUsers().getIdUser() == u.get(0).getIdUser()) {
                        ada = true;
                        j = k;
                    }
                }
            }
            if (ada == false) {
        %>
        <span style='font-family:Trebuchet MS; font-size:16px; color: #193149'>
            <a href="VoteServlet?c=c&vote=1&post=<%=temp.getIdPost()%>">LIKE</a>(<%=like%>)<a href="VoteServlet?vote=2&post=<%=temp.getIdPost()%>">|DISLIKE</a>(<%=dislike%>)
            <%
            } else if (votes.get(j).getVote() == 1)//kalo votenya LIKE
            {
            %>
            LIKE (you already choose this)(<%=like%>)<a href="VoteServlet?c=c&vote=2&idvote=<%=votes.get(j).getIdVote()%>&post=<%=temp.getIdPost()%>">|DISLIKE</a>(<%=dislike%>)
            <%
            } else if (votes.get(j).getVote() == 2)//kalo votenya DISLIKE
            {
            %>
            <a href="VoteServlet?c=c&vote=1&idvote=<%=votes.get(j).getIdVote()%>&post=<%=temp.getIdPost()%>">LIKE</a>(<%=like%>)|DISLIKE(you already choose this)(<%=dislike%>)
            <%
                    }

                    out.println("<hr> </span>");

                }
            %>
        </span>
        <%
            ArrayList<Comments> temp = da.getComment(idpost);

            for (int i = 0;
                    i < temp.size();
                    i++) {
                String nama = da.getUser(temp.get(i).getUsers().getIdUser()).get(0).getName();
                out.print("<span style='font-family:Trebuchet MS;color: #193149'>");
                out.print("<h3>" + nama + "</h3>");
                out.print("<p style='font-size:14px;'>" + temp.get(i).getContent() + "</p>");
                out.print("<p style='font-size:11px;'>Date: " + temp.get(i).getCommentDate() + "</p><br></span>");

                boolean ada = false;
                ArrayList<Votes> votes = da.getVoteComment(temp.get(i).getIdComment());
                int j = 0;
                int like = 0, dislike = 0;

                for (int k = 0; k < votes.size(); k++) {
                    if (votes.get(k).getVote() == 1) {
                        like++;
                    } else {
                        dislike++;
                    }
                    if (!u.isEmpty()) {
                        if (votes.get(k).getUsers().getIdUser() == u.get(0).getIdUser()) {
                            ada = true;
                            j = k;
                        }
                    }
                }
                if (ada == false) {
        %>
        <span style='font-family:Trebuchet MS; font-size:16px; color: #193149'>
            <a  href="VoteServlet?c=c&vote=1&post=<%=data.get(0).getIdPost()%>&comment=<%=temp.get(i).getIdComment()%>">LIKE</a>(<%=like%>)<a href="VoteServlet?c=c&vote=2&post=<%=data.get(0).getIdPost()%>&comment=<%=temp.get(i).getIdComment()%>">|DISLIKE</a>(<%=dislike%>)
            <%
            } else if (votes.get(j).getVote() == 1)//kalo votenya LIKE
            {
            %>
            LIKE (you already choose this)(<%=like%>)<a href="VoteServlet?c=c&vote=2&post=<%=data.get(0).getIdPost()%>&idvote=<%=votes.get(j).getIdVote()%>&comment=<%=temp.get(i).getIdComment()%>"> | DISLIKE</a>(<%=dislike%>)
            <%
            } else if (votes.get(j).getVote() == 2)//kalo votenya DISLIKE
            {
            %>
            <a  href="VoteServlet?c=c&vote=1&post=<%=data.get(0).getIdPost()%>&idvote=<%=votes.get(j).getIdVote()%>&comment=<%=temp.get(i).getIdComment()%>">LIKE</a>(<%=like%>)|DISLIKE(you already choose this)(<%=dislike%>)
            <%
                    }

                    out.println("<hr></span>");

                }

                if (available) {


            %>

            <form action="CommentServlet?post=<%=idpost%>" id="commentform" method="post">
                <span style='font-family:Trebuchet MS; font-size:20px; color: #193149'>
                    Your Comment:
                    <textarea rows="4" cols="50" name="isicomment" form="commentform" required></textarea><br>


                    <input type="submit">
                </span>
            </form>
            <%}%>
            <%@ include file="footer.jsp" %>
    </body>
</html>
