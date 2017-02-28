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

        <h1>POST idnya= <%=idpost%></h1>

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
                String nama = da.getUser(temp.getUsers().getIdUser()).get(0).getName();

                out.println("<br><hr>");
                out.println("Name: " + nama + "<br><br><br>");
                out.println("Title: " + temp.getTitle() + "<br><br><br>");
                out.println("Post Type: " + temp.getPostType() + "<br><br><br>");
                out.println("Content: " + temp.getContent() + "<br><br><br>");
                out.println("Date: " + temp.getPostDate() + "<br><br><br>");

                out.println("<hr>");
            }
            ArrayList<Comments> temp = da.getComment(idpost);
            if (available) {
        %>
        <h2>Comments(<%=temp.size()%>) :</h2><%
            }
            for (int i = 0; i < temp.size(); i++) {
                String nama = da.getUser(temp.get(i).getUsers().getIdUser()).get(0).getName();
                out.println("<br>");
                out.println("Name: " + nama + "<br><br><br>");
                out.println("Isi Comment:  " + temp.get(i).getContent() + "<br><br><br>");
                out.println("Date: " + temp.get(i).getCommentDate() + "<br><br><br>");

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
        <a href="VoteServlet?c=c&vote=1&post=<%=data.get(0).getIdPost()%>&comment=<%=temp.get(i).getIdComment()%>">[LIKE]</a>(<%=like%>)<a href="VoteServlet?c=c&vote=2&post=<%=data.get(0).getIdPost()%>&comment=<%=temp.get(i).getIdComment()%>">|[DISLIKE]</a>(<%=dislike%>)
        <%
        } else if (votes.get(j).getVote() == 1)//kalo votenya LIKE
        {
        %>
        [LIKE (you already choose this)](<%=like%>)<a href="VoteServlet?c=c&vote=2&post=<%=data.get(0).getIdPost()%>&idvote=<%=votes.get(j).getIdVote()%>&comment=<%=temp.get(i).getIdComment()%>">|[DISLIKE]</a>(<%=dislike%>)
        <%
        } else if (votes.get(j).getVote() == 2)//kalo votenya DISLIKE
        {
        %>
        <a href="VoteServlet?c=c&vote=1&post=<%=data.get(0).getIdPost()%>&idvote=<%=votes.get(j).getIdVote()%>&comment=<%=temp.get(i).getIdComment()%>">[LIKE]</a>(<%=like%>)|[DISLIKE(you already choose this)](<%=dislike%>)
        <%
            }

     
                out.println("<hr>");

            }
      

        if (available) {


        %>

        <form action="CommentServlet?post=<%=idpost%>" id="commentform" method="post">

            Your Comment:
            <textarea rows="4" cols="50" name="isicomment" form="commentform" required></textarea><br>


            <input type="submit">
        </form>
        <%}%>
        <%@ include file="footer.jsp" %>
    </body>
</html>
