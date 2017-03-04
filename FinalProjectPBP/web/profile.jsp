<%-- 
    Document   : profile
    Created on : Mar 4, 2017, 4:59:38 PM
    Author     : Kevin
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Users"%>
<%@page import="controller.DataAkses"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
    </head>
    <body>

        <%@ include file="header.jsp" %>
        <%            if (request.getParameter("error") != null) {
                int error = Integer.parseInt(request.getParameter("error"));
                if (error == 1) {
        %><h2>Password didnt match!</h2><%
        } else if (error == 2) {
        %><h2>Username Taken!</h2><%
                }
            }

            String name = (String) session.getAttribute("username");
            if (name != null) {
                DataAkses da = new DataAkses();
                ArrayList<Users> user = da.getUser(name);
                Users temp = user.get(0);
        %>
        <form action="ProfileServlet" method="post">
            Username: <input type="teks" name="username" value="<%=temp.getUsername()%>"/><br>
            Nama: <input type="teks" name="nama" value="<%=temp.getName()%>"/><br>
            Age: <input type="teks" name="age" value="<%=temp.getAge()%>"/><br>
            Email: <input type="teks" name="email" value="<%=temp.getEmail()%>"/><br>
            Password: <input type="password" name="pass" value="<%=temp.getPassword()%>"/><br>
            Confirm Password: <input type="password" name="cpass" value="<%=temp.getPassword()%>"/><br>

            <input type="submit" name="Submit" value="Save Profile"/>
        </form>
        <%}%>
        <%@ include file="footer.jsp" %>
    </body>
</html>
