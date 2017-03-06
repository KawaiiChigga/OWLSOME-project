<%-- 
    Document   : editprofile
    Created on : Mar 6, 2017, 5:35:35 PM
    Author     : USER
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Users"%>
<%@page import="controller.DataAkses"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Profile</title>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <%            

            String name = (String) session.getAttribute("username");
            if (name != null) {
                DataAkses da = new DataAkses();
                ArrayList<Users> user = da.getUser(name);
                Users temp = user.get(0);
        %>

        <form action="ProfileServlet" method="post">
            <table style="font-family:Trebuchet MS; font-size:20px; color: #193149">
                <tr>
                    <td><b> Username</b></td>
                    <td> &nbsp; &nbsp; &nbsp; </td>
                    <td><input type="teks" name="username" value="<%=temp.getUsername()%>"/> </td>
                </tr>

                <tr>
                    <td><b>Name</b></td>
                    <td> &nbsp; &nbsp; &nbsp; </td>
                    <td><input type="teks" name="nama" value="<%=temp.getName()%>"/> </td>
                </tr>

                <tr>
                    <td><b>Age</b></td>
                    <td> &nbsp; &nbsp; &nbsp; </td>
                    <td> <input type="teks" name="age" value="<%=temp.getAge()%>"/> </td>
                </tr>

                <tr>
                    <td><b>Email</b></td>
                    <td> &nbsp; &nbsp; &nbsp; </td>
                    <td> <input type="teks" name="email" value="<%=temp.getEmail()%>"/> </td>
                </tr>

                <tr>
                    <td><b>Old Password</b></td>
                    <td> &nbsp; &nbsp; &nbsp; </td>
                    <td> <input type="password" name="opass"/> </td>
                </tr>

                <tr>
                    <td><b>New Password</b></td>
                    <td> &nbsp; &nbsp; &nbsp; </td>
                    <td> <input type="password" name="pass"/> </td>
                </tr>
                <tr>
                    <td><b>Confirm Password</b></td>
                    <td> &nbsp; &nbsp; &nbsp; </td>
                    <td> <input type="password" name="cpass"/> </td>
                </tr>

                <tr>
                    <td><input type="submit" name="Submit" value="Save Profile"/> </td>
                </tr>
            </table>

        </form>
        <%}%>
        <%@ include file="footer.jsp" %>
    </body>
</html>