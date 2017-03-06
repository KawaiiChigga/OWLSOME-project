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
        <span style="font-family:Trebuchet MS; font-size:26px; color: #193149"><b>REGISTER</b></span>
        <hr><br><br>
         
        <form action="RegisterServlet" method="Post">
               <table><tr>
                       <td style="font-family:Trebuchet MS; font-size:20px; color: #193149"><b>Username</b></td>
                       <td><input type="text" name="username" required/></td>
                </tr>
                <tr>
                    <td style="font-family:Trebuchet MS; font-size:20px; color: #193149"><b>Email</b></td> 
                    <td><input type="email" name="email" required/></td></tr>
                <tr><td style="font-family:Trebuchet MS; font-size:20px; color: #193149"><b>Password</b></td>
                <td><input type="password" name="password" required /></td></tr>
                <tr><td style="font-family:Trebuchet MS; font-size:20px; color: #193149"><b>Confirm Password</b></td>
                <td><input type="password" name="confirmpassword" required/></td></tr>
                <tr><td style="font-family:Trebuchet MS; font-size:20px; color: #193149"><b>Name</b></td>
                <td><input type="text" name="name" required/></td></tr>
                <tr><td style="font-family:Trebuchet MS; font-size:20px; color: #193149"><b>Age</b></td>
                <td><input type="text" name="age" required/></td></tr>
                <tr><td style="font-family:Trebuchet MS; font-size:20px; color: #193149"><b>Gender</b></td>
                <td style="font-family:Trebuchet MS; font-size:20px; color: #193149"><b><input type="radio" name="gender" value="male" checked> Male
                        <input type="radio" name="gender" value="female"> Female</b></td></tr>
                <tr><td><br><input type="submit" value="Submit" style=" background-color:#193149; color:white; font-family:tahoma; font-size:18px;"/>
                <a href="login.jsp"><input type="button" value="Cancel" style=" background-color:#193149; color:white; font-family:tahoma; font-size:18px;" /></a></td></tr>
           </table>
        </form>
    
        <%@ include file="footer.jsp" %>
    </body>
</html>
