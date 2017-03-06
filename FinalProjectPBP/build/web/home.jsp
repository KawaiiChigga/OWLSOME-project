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


        <div style="margin-bottom :10px;">
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

                    <td>
                        <select name="type">
                            <option value="games" style="font-family:Trebuchet MS; font-size:14px">Games</option>
                            <option value="education" style="font-family:Trebuchet MS; font-size:14px">Education</option>
                            <option value="lifestyle" style="font-family:Trebuchet MS; font-size:14px">Lifestyle</option>
                            <option value="sport" style="font-family:Trebuchet MS; font-size:14px">Sport</option>
                            <option value="coding" style="font-family:Trebuchet MS; font-size:14px">Coding</option>
                            <option value="traveling" style="font-family:Trebuchet MS; font-size:14px">Traveling</option>
                            <option value="economics" style="font-family:Trebuchet MS; font-size:14px">Economics</option>
                            <option value="movies" style="font-family:Trebuchet MS; font-size:14px">Movies</option>
                            <option value="otomotif" style="font-family:Trebuchet MS; font-size:14px">Otomotif</option>
                            <option value="politics" style="font-family:Trebuchet MS; font-size:14px">Politics</option>
                        </select>
                    </td>
                    
                    <td>
                        <input style=" background-color:#193149; color:white; font-family:tahoma; font-size:18px; margin-left: 10px" value="Upload" type="submit">
                    </td>
                </tr>

            </table>
        </form>
            

        <button id="button1"> 
            Post
        </button>
        </div>    
        <%            if (request.getParameter("type") == null) {

        %>
        <style>
            a {
                text-decoration: none;
                font-family:Trebuchet MS;
                color: #193149;
            }
            .url {
                width:100%; 
                height: 70px; 
                padding-top:1px;
                text-align: center;
                margin-bottom: 5px;
            }
        </style>
        <a href="home.jsp?type=games">
            <div class="url" style="background-color: #ffcc00">
                <h1><b>GAMES</b></h1>
            </div>
        </a>
        <a href="home.jsp?type=education">
            <div class="url" style="background-color: #f9c806">
                <h1><b>EDUCATION</b></h1>
            </div>
        </a>
        <a href="home.jsp?type=lifestyle">
            <div class="url" style="background-color: #f2c40d">
                <h1><b>LIFESTYLE</b></h1>
            </div>
        </a>
        <a href="home.jsp?type=sport">
            <div class="url" style="background-color: #ecc113">
                <h1><b>SPORT</b></h1>
            </div>
        </a>
        <a href="home.jsp?type=coding">
            <div class="url" style="background-color: #e6bd19">
                <h1><b>CODING</b></h1>
            </div>
        </a>
        <a href="home.jsp?type=traveling">
            <div class="url" style="background-color: #dfb920">
                <h1><b>TRAVELING</b></h1>
            </div>
        </a>
        <a href="home.jsp?type=economics">
            <div class="url" style="background-color: #d9b526">
                <h1><b>ECONOMICS</b></h1>
            </div>
        </a>
        <a href="home.jsp?type=movies">
            <div class="url" style="background-color: #d2b12d">
                <h1><b>MOVIES</b></h1>
            </div>
        </a>
        <a href="home.jsp?type=otomotif">
            <div class="url" style="background-color: #ccad33">
                <h1><b>OTOMOTIF</b></h1>
            </div>
        </a>
        <a href="home.jsp?type=politics">
            <div class="url" style="background-color: #c6aa39">
                <h1><b>POLITICS</b></h1>
            </div>
        </a>
<!--        <h1><a style="font-family:Trebuchet MS; font-size:26px; color: #193149" href="home.jsp?type=education"><b>EDUCATION</b></a></h1>
        <h1><a style="font-family:Trebuchet MS; font-size:26px; color: #193149" href="home.jsp?type=lifestyle"><b>LIFESTYLE</b></a></h1>
        <h1><a style="font-family:Trebuchet MS; font-size:26px; color: #193149" href="home.jsp?type=sport"><b>SPORT</b></a></h1>
        <h1><a style="font-family:Trebuchet MS; font-size:26px; color: #193149" href="home.jsp?type=coding"><b>CODING</b></a></h1>
        <h1><a style="font-family:Trebuchet MS; font-size:26px; color: #193149" href="home.jsp?type=traveling"><b>TRAVELING</b></a></h1>
        <h1><a style="font-family:Trebuchet MS; font-size:26px; color: #193149" href="home.jsp?type=economics"><b>ECONOMICS</b></a></h1>
        <h1><a style="font-family:Trebuchet MS; font-size:26px; color: #193149" href="home.jsp?type=movies"><b>MOVIES</b></a></h1>
        <h1><a style="font-family:Trebuchet MS; font-size:26px; color: #193149" href="home.jsp?type=otomotif"><b>OTOMOTIF</b></a></h1>
        <h1><a style="font-family:Trebuchet MS; font-size:26px; color: #193149" href="home.jsp?type=politics"><b>POLITICS</b></a></h1>-->
        <%        } else {
            String type = request.getParameter("type");
            DataAkses da = new DataAkses();
            ArrayList<Posts> data = new ArrayList<Posts>();
            data = da.getAllPost(type);
            if (data.isEmpty()) {
        %>
        <h1>There is no Post(s) in this Category :'(</h1>

        <%
        } else {
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
                out.print("<p style='font-size:11px;'> Post Type: " + temp.getPostType() + " | Date: " + temp.getPostDate() + "</p><br><br></span>");

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
                }
            %>
        </span>


        <%}%>

        <%@ include file="footer.jsp" %>

    </body>
</html>
