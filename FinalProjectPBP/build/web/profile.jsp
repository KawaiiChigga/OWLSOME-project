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
        <%!DataAkses da;
            ArrayList<Users> user;
            Users temp;
            String name;
        %>
        <%            String userProfile = "";
            if (request.getParameter("username") != null) {

                userProfile = request.getParameter("username");
            }
            name = (String) session.getAttribute("username");
            if (request.getParameter("error") != null) {
                int error = Integer.parseInt(request.getParameter("error"));
                if (error == 1) {
        %><h2>Wrong Old Password or New Password didnt match!</h2><%
        } else if (error == 2) {
        %><h2>Username Taken!</h2><%
                }
            }
            if (!userProfile.equals("")) {
                da = new DataAkses();
                user = da.getUser(userProfile);
                temp = user.get(0);
            } else if (name != null) {
                da = new DataAkses();
                user = da.getUser(name);
                temp = user.get(0);
            }

        %>

        <table style="font-family:Trebuchet MS; font-size:20px; color: #193149">
            <tr>
                <td><b> Username</b></td>
                <td> &nbsp; &nbsp; &nbsp; </td>
                <td><%=temp.getUsername()%> </td>
            </tr>

            <tr>
                <td><b>Name</b></td>
                <td> &nbsp; &nbsp; &nbsp; </td>
                <td> <%=temp.getName()%> </td>
            </tr>

            <tr>
                <td><b>Age</b></td>
                <td> &nbsp; &nbsp; &nbsp; </td>
                <td> <%=temp.getAge()%> </td>
            </tr>
            <tr>
                <td><b> Email</b></td>
                <td> &nbsp; &nbsp; &nbsp; </td>
                <td> <%=temp.getEmail()%> </td>
            </tr>

            <tr>

                <%
                    System.out.println("user profile : " + userProfile);
                    System.out.println("user  : " + name);
                    if (userProfile.equals(name)) {
                %>

                <td><a href="editprofile.jsp"><input type="button" value="Edit Profile"/></a></td>
                        <%
                            }%>
            </tr>
        </table>



        <%@ include file="footer.jsp" %>
    </body>
</html>

