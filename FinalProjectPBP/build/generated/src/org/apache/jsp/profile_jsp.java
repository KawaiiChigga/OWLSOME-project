package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Users;
import controller.DataAkses;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Profile</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
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
      out.write("                    Search :   \r\n");
      out.write("                    <input type=\"text\" name=\"keyword\" required/>\r\n");
      out.write("                    <input type=\"submit\" value=\"Submit\"/>\r\n");
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
      out.write("        ");
            if (request.getParameter("error") != null) {
                int error = Integer.parseInt(request.getParameter("error"));
                if (error == 1) {
        
      out.write("<h2>Password didnt match!</h2>");

            }
            if (error == 2) {
        
      out.write("<h2>Username Taken!</h2>");

                }
            }

            String name = (String) session.getAttribute("username");
            if (name != null) {
                DataAkses da = new DataAkses();
                ArrayList<Users> user = da.getUser(name);
                Users temp = user.get(0);
        
      out.write("\n");
      out.write("        <form action=\"ProfileServlet\" method=\"post\">\n");
      out.write("            Username: <input type=\"teks\" name=\"username\" value=\"");
      out.print(temp.getUsername());
      out.write("\"/><br>\n");
      out.write("            Nama: <input type=\"teks\" name=\"nama\" value=\"");
      out.print(temp.getName());
      out.write("\"/><br>\n");
      out.write("            Age: <input type=\"teks\" name=\"age\" value=\"");
      out.print(temp.getAge());
      out.write("\"/><br>\n");
      out.write("            Email: <input type=\"teks\" name=\"email\" value=\"");
      out.print(temp.getEmail());
      out.write("\"/><br>\n");
      out.write("            Password: <input type=\"password\" name=\"pass\" value=\"");
      out.print(temp.getPassword());
      out.write("\"/><br>\n");
      out.write("            Confirm Password: <input type=\"password\" name=\"cpass\" value=\"");
      out.print(temp.getPassword());
      out.write("\"/><br>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" name=\"Submit\" value=\"Save Profile\"/>\n");
      out.write("        </form>\n");
      out.write("        ");
}
      out.write("\n");
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
