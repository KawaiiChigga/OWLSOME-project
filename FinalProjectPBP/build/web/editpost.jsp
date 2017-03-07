<%-- 
    Document   : editpost
    Created on : Mar 7, 2017, 10:41:07 AM
    Author     : Kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <body>
        <%@ include file="header.jsp" %>
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

        <%@ include file="footer.jsp" %>
    </body>
</html>
