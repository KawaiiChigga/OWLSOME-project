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
                color: white;
                background-color: black;
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
                    <h1>INI FORUM</h1>
                <%
                    if (username == null){
                        %>
                        <h4>You must login or register first!</h4>
                <%
                    }
                    else
                    {
                        
                        %>
                <h4>Welcome, <%=username%>!</h4>
                <%
                    }
                %>
            </header>

            <nav>
                <ul>

                    <li><a href="home.jsp">Home</a></li>


                    <%
            if (username == null) {%>
                    <li><a href="login.jsp">Login</a></li>
                    <li><a href="register.jsp">Register</a></li>
                        <% } else {%>
                    <li><a href="LogoutServlet">Logout</a></li>

                    <%}
                    %>
                </ul>
            </nav>

            <article>
