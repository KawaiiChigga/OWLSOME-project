package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        <style>\n");
      out.write("            div.container {\n");
      out.write("                width: 100%;\n");
      out.write("                border: 1px solid gray;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            header, footer {\n");
      out.write("                padding: 1em;\n");
      out.write("                color: black;\n");
      out.write("                background-color: #F6DF5A;\n");
      out.write("                clear: left;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            nav {\n");
      out.write("                float: left;\n");
      out.write("                max-width: 160px;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 1em;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            nav ul {\n");
      out.write("                list-style-type: none;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            nav ul a {\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            article {\n");
      out.write("                margin-left: 170px;\n");
      out.write("                border-left: 1px solid gray;\n");
      out.write("                padding: 1em;\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <header>\n");
      out.write("\n");
      out.write("                \n");
      out.write("                ");

                    String username = (String) session.getAttribute("username");
                
      out.write("\n");
      out.write("                <img src=\"owl.png\">\n");
      out.write("                ");

                    if (username == null) {
                
      out.write("\n");
      out.write("                <h4 style=\"font-family:Trebuchet MS; font-size:22px; color: #193149\">Login First!</h4>\n");
      out.write("                ");

                } else {

                
      out.write("\n");
      out.write("                <h4>Welcome, ");
      out.print(username);
      out.write("!</h4>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("\n");
      out.write("                    <li><a style=\"font-family:Trebuchet MS; font-size:20px\" href=\"home.jsp\">HOME</a></li>\n");
      out.write("                    <li><hr></li>\n");
      out.write("\n");
      out.write("                    ");

                        if (username == null) {
      out.write("\n");
      out.write("                    <li><a style=\"font-family:Trebuchet MS; font-size:20px\" href=\"login.jsp\">LOGIN</a></li>\n");
      out.write("                    <li><hr></li>\n");
      out.write("                    <li><a style=\"font-family:Trebuchet MS; font-size:20px\" href=\"register.jsp\">REGISTER</a></li>\n");
      out.write("                        ");
 } else {
      out.write("\n");
      out.write("                    <li><hr></li>\n");
      out.write("                    <li><a style=\"font-family:Trebuchet MS; font-size:20px\" href=\"LogoutServlet\">LOGOUT</a></li>\n");
      out.write("\n");
      out.write("                    ");
}
                    
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <article>\n");
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
