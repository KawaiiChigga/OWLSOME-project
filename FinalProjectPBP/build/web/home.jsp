<%-- 
    Document   : home
    Created on : Feb 21, 2017, 6:52:14 PM
    Author     : Kevin
--%>

<%@page import="model.Votes"%>
<%@page import="model.Comments"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Collection"%>
<%@page import="model.Posts"%>
<%@page import="model.Users"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controller.DataAkses"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <%

            String name = (String) session.getAttribute("username");
        %>
        <%@ include file="header.jsp" %>


        <script src=jquery-1.11.3.min.js></script>

        <script>
            $(document).ready(function () {

                $("#postform").hide();

                $("#button1").click(function () {
                    $("#postform").toggle(750);
                });
            });
        </script>



        <form action="PostServlet" id="postform" method="post">
            <table>
                <tr>
                    <td><p style="font-family:Trebuchet MS; font-size:22px; color: #193149">
                            <b>TITLE</b> </p>
                    </td>
                    <td><input type="text" name="title" required 
                               style="font-size: 22px; margin-left: 10px">
                    </td>

                </tr>
                <tr>
                    <td><p style="font-family:Trebuchet MS; font-size:22px; color: #193149">
                            <b>CONTENT</b> </p>
                    </td>
                    <td>
                        <textarea rows="5" cols="100" name="isipost" form="postform" required style="margin-left: 10px"></textarea>
                    </td>
                </tr>

                <tr>
                    <td><p style="font-family:Trebuchet MS; font-size:22px; color: #193149">
                            <b>TYPE</b> </p>
                    </td>
                    
                    <td><input  type="radio" name="type" value="games" checked/><span style="font-family:Trebuchet MS; font-size:20px">Games</span>
                        <input  type="radio" name="type" value="education" /><span style="font-family:Trebuchet MS; font-size:20px">Education  </span>
                        <input  type="radio" name="type" value="lifestyle" /><span style="font-family:Trebuchet MS; font-size:20px">Lifestyle</span>
                        <input style=" background-color:#193149; color:white; font-family:tahoma; font-size:18px; margin-left: 10px" type="submit">
                    </td>



                </tr>

            </table>
        </form>


        <button id="button1"> 
            Show & Hide 
        </button>

        <%            DataAkses da = new DataAkses();
            ArrayList<Posts> data = new ArrayList<Posts>();
            data = da.getAllPost();
            Collections.reverse(data);
            ArrayList<Users> u = da.getUser(name);

        %>




        <%            for (int i = 0; i < data.size(); i++) {
                Posts temp = data.get(i);
                String nama = da.getUser(temp.getUsers().getIdUser()).get(0).getName();
                ArrayList<Comments> comments = da.getComment(temp.getIdPost());

                out.println("<br><hr>");
                out.println("<h3>" + nama + "</h3><br>");
                out.println("Title: " + temp.getTitle() + "<br><br><br>");
                out.println("Post Type: " + temp.getPostType() + "<br><br><br>");
                out.println("Content: " + temp.getContent() + "<br><br><br>");
                out.println("Date: " + temp.getPostDate() + "<br><br><br>");

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
        <a href="VoteServlet?vote=1&post=<%=temp.getIdPost()%>">[LIKE]</a>(<%=like%>)<a href="VoteServlet?vote=2&post=<%=temp.getIdPost()%>">|[DISLIKE]</a>(<%=dislike%>)
        <%
        } else if (votes.get(j).getVote() == 1)//kalo votenya LIKE
        {
        %>
        [LIKE (you already choose this)](<%=like%>)<a href="VoteServlet?vote=2&idvote=<%=votes.get(j).getIdVote()%>&post=<%=temp.getIdPost()%>">|[DISLIKE]</a>(<%=dislike%>)
        <%
        } else if (votes.get(j).getVote() == 2)//kalo votenya DISLIKE
        {
        %>
        <a href="VoteServlet?vote=1&idvote=<%=votes.get(j).getIdVote()%>&post=<%=temp.getIdPost()%>">[LIKE]</a>(<%=like%>)|[DISLIKE(you already choose this)](<%=dislike%>)
        <%
            }

        %>
        <br><br><a href="comment.jsp?post=<%=temp.getIdPost()%>">Comments (<%=comments.size()%>)</a>
        <%
                out.println("<hr>");

            }
        %>
        <%@ include file="footer.jsp" %>

    </body>
</html>