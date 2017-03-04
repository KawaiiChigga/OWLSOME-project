<%-- 
    Document   : search
    Created on : Mar 4, 2017, 3:39:36 PM
    Author     : Kevin
--%>

<%@page import="model.Votes"%>
<%@page import="model.Comments"%>
<%@page import="model.Users"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Posts"%>
<%@page import="controller.DataAkses"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <%            
                 String name = (String) session.getAttribute("username");
                 String keyword = request.getParameter("keyword");
                 
            DataAkses da = new DataAkses();
            ArrayList<Posts> data = new ArrayList<Posts>();
            data = da.searchPost(keyword);
            if(data.isEmpty())
            {
        %><h1>Post(s) Not Found</h1><%
            }
            else
{
%>Keyword: <%=keyword%> matches <%=data.size()%> Post(s)<%
}

            Collections.reverse(data);
            ArrayList<Users> u = da.getUser(name);
            for (int i = 0; i < data.size(); i++) {
                Posts temp = data.get(i);
                String nama = da.getUser(temp.getUsers().getIdUser()).get(0).getName();
                ArrayList<Comments> comments = da.getComment(temp.getIdPost());

                out.print("<span style='font-family:Trebuchet MS; color: #193149'><br><hr>");
                out.print("<h2>" + nama + "</h2>");
                out.print("<p style='font-size:20px;'>===== " + temp.getTitle() + " =====</p>");
                out.print("<p style='font-size:14px;'> " + temp.getContent() + "</p>");
                out.print("<p style='font-size:11px;'> Post Type: " + temp.getPostType() + " | Date: " + temp.getPostDate() +"</p><br><br></span>");

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
        <a href="VoteServlet?vote=1&post=<%=temp.getIdPost()%>">LIKE</a>(<%=like%>)<a href="VoteServlet?vote=2&post=<%=temp.getIdPost()%>">|DISLIKE</a>(<%=dislike%>)
        <%
        } else if (votes.get(j).getVote() == 1)//kalo votenya LIKE
        {
        %>
        LIKE (you already choose this)(<%=like%>)<a href="VoteServlet?vote=2&idvote=<%=votes.get(j).getIdVote()%>&post=<%=temp.getIdPost()%>">|DISLIKE</a>(<%=dislike%>)
        <%
        } else if (votes.get(j).getVote() == 2)//kalo votenya DISLIKE
        {
        %>
        <a href="VoteServlet?vote=1&idvote=<%=votes.get(j).getIdVote()%>&post=<%=temp.getIdPost()%>">LIKE</a>(<%=like%>)|DISLIKE(you already choose this)(<%=dislike%>)
        <%
            }

        %>
        <br><br><a href="comment.jsp?post=<%=temp.getIdPost()%>">Comments (<%=comments.size()%>)</a>
        <%
                out.println("<hr> </span>");

            }
        %>
        </span>
        <%@ include file="footer.jsp" %>
    </body>
</html>
