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
         <h1>Login!</h1>
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
            username        :   
            <input type="text" name="username" required/><br>
            password        :   
            <input type="password" name="password" required/><br>
            <br><br>
            <input type="submit" value="Submit"/>
          
        <a href="register.jsp"><input type="button" value="Register"/></a>
            </form>
        <%@ include file="footer.jsp" %>
    </body>
</html>
