package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <style>\r\n");
      out.write("            div.container {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                border: 1px solid gray;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            header, footer {\r\n");
      out.write("                padding: 1em;\r\n");
      out.write("                color: black;\r\n");
      out.write("                background-color: #F6DF5A;\r\n");
      out.write("                clear: left;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            nav {\r\n");
      out.write("                float: left;\r\n");
      out.write("                max-width: 160px;\r\n");
      out.write("                margin: 0;\r\n");
      out.write("                padding: 1em;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            nav ul {\r\n");
      out.write("                list-style-type: none;\r\n");
      out.write("                padding: 0;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            nav ul a {\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            article {\r\n");
      out.write("                margin-left: 170px;\r\n");
      out.write("                border-left: 1px solid gray;\r\n");
      out.write("                padding: 1em;\r\n");
      out.write("                overflow: hidden;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("            <header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");

                    String username = (String) session.getAttribute("username");
                
      out.write("\r\n");
      out.write("                <img src=\"owl.png\">\r\n");
      out.write("     \r\n");
      out.write("                <form action=\"search.jsp\" method=\"Post\">\r\n");
      out.write("                    <span style=\"font-family:Trebuchet MS; font-size:20px; color: #193149\"><b>SEACRH : </b></span>  \r\n");
      out.write("                    <input type=\"text\" name=\"keyword\" required/>\r\n");
      out.write("                    <input type=\"submit\" value=\"Submit\" style=\" background-color:#193149; color:white; font-family:tahoma; font-size:18px;\"/>\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("            </header>\r\n");
      out.write("\r\n");
      out.write("            <nav>\r\n");
      out.write("                <ul>\r\n");
      out.write("\r\n");
      out.write("                    <li><a style=\"font-family:Trebuchet MS; font-size:20px\" href=\"home.jsp\">HOME</a></li>\r\n");
      out.write("                    <li><hr></li>\r\n");
      out.write("\r\n");
      out.write("                    ");

                        if (username == null) {
      out.write("\r\n");
      out.write("                    <li><a style=\"font-family:Trebuchet MS; font-size:20px\" href=\"login.jsp\">LOGIN</a></li>\r\n");
      out.write("                    <li><hr></li>\r\n");
      out.write("                    <li><a style=\"font-family:Trebuchet MS; font-size:20px\" href=\"register.jsp\">REGISTER</a></li>\r\n");
      out.write("                        ");
 } else {
      out.write("\r\n");
      out.write("                    <li></li>\r\n");
      out.write("                    <li><a style=\"font-family:Trebuchet MS; font-size:20px\" href=\"profile.jsp\">@");
      out.print(username);
      out.write("</a></li>\r\n");
      out.write("                     <li><hr></li>\r\n");
      out.write("                    <li><a style=\"font-family:Trebuchet MS; font-size:20px\" href=\"LogoutServlet\">LOGOUT</a></li>\r\n");
      out.write("\r\n");
      out.write("                    ");
}
                    
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            <article>\r\n");
      out.write("\n");
      out.write("        <span style=\"font-family:Trebuchet MS; font-size:26px; color: #193149\"><b>LOGIN</b></span>\n");
      out.write("        <hr><br><br>\n");
      out.write("        \n");
      out.write("          ");

              
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
        
      out.write("\n");
      out.write("        <h3>Register Error, Please Check your Data!</h3>\n");
      out.write("        ");

        } else if (status.equals("2")) {
        
      out.write("\n");
      out.write("        <h3>Login Failed!</h3>\n");
      out.write("\n");
      out.write("        ");

        } else {
        
      out.write("\n");
      out.write("        <h3>Login Berhasil!!</h3>\n");
      out.write("        ");

                }
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <form action=\"LoginServlet?post=");
      out.print(idpost);
      out.write("\" method=\"Post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"font-family:Trebuchet MS; font-size:20px; color: #193149\"><b>Username</b></td>\n");
      out.write("                    <td> <input type=\"text\" name=\"username\" required/> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"font-family:Trebuchet MS; font-size:20px; color: #193149\"><b>Password</b></td>\n");
      out.write("                    <td> <input type=\"password\" name=\"password\" required/> </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td><br><input type=\"submit\" value=\"Submit\" style=\" background-color:#193149; color:white; font-family:tahoma; font-size:18px;\"/></td>\n");
      out.write("                    <td><a href=\"register.jsp\"><input type=\"button\" value=\"Register\" style=\" background-color:#193149; color:white; font-family:tahoma; font-size:18px;\"/></a></td>    \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            </form>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("</article>\n");
      out.write("\n");
      out.write("<footer>Copyright &copy; 1115006 | 1115008 | 1115038</footer>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
