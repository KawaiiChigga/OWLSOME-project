<%-- 
    Document   : Login.jsp
    Created on : Feb 21, 2017, 4:06:41 PM
    Author     : Kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <span style="font-family:Trebuchet MS; font-size:26px; color: #193149"><b>LOGIN</b></span>
        <hr><br><br>
        
          <%
              
            String status = request.getParameter("status");
            
            int idpost;
            if(request.getParameter("post")!=null){
                idpost = Integer.parseInt(request.getParameter("post"));
            }
            else
            {
                idpost = -1;
            }
            if (status != null) {
                if (status.equals("1")) {
        %>
        <h3>Register Error, Please Check your Data!</h3>
        <%
        } else if (status.equals("2")) {
        %>
        <h3>Login Failed!</h3>

        <%
        } else {
        %>
        <h3>Login Berhasil!!</h3>
        <%
                }
            }
        %>
        
        <form action="LoginServlet?post=<%=idpost%>" method="Post">
            <table>
                <tr>
                    <td style="font-family:Trebuchet MS; font-size:20px; color: #193149"><b>Username</b></td>
                    <td> <input type="text" name="username" required/> </td>
                </tr>
                <tr>
                    <td style="font-family:Trebuchet MS; font-size:20px; color: #193149"><b>Password</b></td>
                    <td> <input type="password" name="password" required/> </td>
                </tr>
                
                <tr>
                    <td><br><input type="submit" value="Submit" style=" background-color:#193149; color:white; font-family:tahoma; font-size:18px;"/></td>
                    <td><br><a href="register.jsp"><input type="button" value="Register" style=" background-color:#193149; color:white; font-family:tahoma; font-size:18px;"/></a></td>    
                </tr>
            </table>
            </form>
        <%@ include file="footer.jsp" %>
    </body>
</html>
