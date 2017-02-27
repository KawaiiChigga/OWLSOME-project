<%-- 
    Document   : register
    Created on : Feb 21, 2017, 4:45:05 PM
    Author     : Kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <h1>Register!</h1>
         
        <form action="RegisterServlet" method="Post">
               <table><tr>
                       <td>username:</td>
                       <td><input type="text" name="username" required/></td>
                </tr>
                <tr>
                    <td>email:</td> 
                    <td><input type="email" name="email" required/></td></tr>
                <tr><td>password: </td>
                <td><input type="password" name="password" required /></td></tr>
                <tr><td>confirm password: </td>
                <td><input type="password" name="confirmpassword" required/></td></tr>
                <tr><td>name: </td>
                <td><input type="text" name="name" required/></td></tr>
                <tr><td>age: </td>
                <td><input type="text" name="age" required/></td></tr>
                <tr><td>gender: </td>
                <td><input type="radio" name="gender" value="male" checked> Male
                <input type="radio" name="gender" value="female"> Female</td></tr>
                <tr><td><input type="submit" value="Submit"/>
                <a href="login.jsp"><input type="button" value="Cancel"/></a></td></tr>
           </table>
        </form>
    
        <%@ include file="footer.jsp" %>
    </body>
</html>
