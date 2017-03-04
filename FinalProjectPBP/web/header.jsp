<%-- 
    Document   : Home
    Created on : Feb 21, 2017, 10:40:08 AM
    Author     : Kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            div.container {
                width: 100%;
                border: 1px solid gray;
            }

            header, footer {
                padding: 1em;
                color: black;
                background-color: #F6DF5A;
                clear: left;
                text-align: center;
            }

            nav {
                float: left;
                max-width: 160px;
                margin: 0;
                padding: 1em;
            }

            nav ul {
                list-style-type: none;
                padding: 0;
            }

            nav ul a {
                text-decoration: none;
            }

            article {
                margin-left: 170px;
                border-left: 1px solid gray;
                padding: 1em;
                overflow: hidden;
            }
        </style>
    </head>
    <body>

        <div class="container">

            <header>


                <%
                    String username = (String) session.getAttribute("username");
                %>
                <img src="owl.png">
     
                <form action="search.jsp" method="Post">
                    Search :   
                    <input type="text" name="keyword" required/>
                    <input type="submit" value="Submit"/>

                </form>
            </header>

            <nav>
                <ul>

                    <li><a style="font-family:Trebuchet MS; font-size:20px" href="home.jsp">HOME</a></li>
                    <li><hr></li>

                    <%
                        if (username == null) {%>
                    <li><a style="font-family:Trebuchet MS; font-size:20px" href="login.jsp">LOGIN</a></li>
                    <li><hr></li>
                    <li><a style="font-family:Trebuchet MS; font-size:20px" href="register.jsp">REGISTER</a></li>
                        <% } else {%>
                    <li></li>
                    <li><a style="font-family:Trebuchet MS; font-size:20px" href="">@<%=username%></a></li>
                     <li><hr></li>
                    <li><a style="font-family:Trebuchet MS; font-size:20px" href="LogoutServlet">LOGOUT</a></li>

                    <%}
                    %>
                </ul>
            </nav>

            <article>
