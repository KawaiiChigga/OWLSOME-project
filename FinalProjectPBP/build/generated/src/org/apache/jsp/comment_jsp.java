package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Comments;
import java.util.ArrayList;
import java.util.Collections;
import model.Posts;
import controller.DataAkses;

public final class comment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Comment</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
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
      out.write("                color: white;\n");
      out.write("                background-color: black;\n");
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
      out.write("                \n");
      out.write("                    ");

                        String username = (String) session.getAttribute("username");
                    
      out.write("\n");
      out.write("                    <h1>INI FORUM</h1>\n");
      out.write("                ");

                    if (username == null){
                        
      out.write("\n");
      out.write("                        <h4>You must login or register first!</h4>\n");
      out.write("                ");

                    }
                    else
                    {
                        
                        
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
      out.write("                    <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");

            if (username == null) {
      out.write("\n");
      out.write("                    <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                    <li><a href=\"register.jsp\">Register</a></li>\n");
      out.write("                        ");
 } else {
      out.write("\n");
      out.write("                    <li><a href=\"LogoutServlet\">Logout</a></li>\n");
      out.write("\n");
      out.write("                    ");
}
                    
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <article>\n");
      out.write("\n");
      out.write("        ");
            int idpost = -1;
            if (request.getParameter("post") != null) {
                idpost = Integer.parseInt(request.getParameter("post"));

            }

        
      out.write("\n");
      out.write("\n");
      out.write("        <h1>POST idnya= ");
      out.print(idpost);
      out.write("</h1>\n");
      out.write("\n");
      out.write("        ");

            Boolean available = true;
            DataAkses da = new DataAkses();
            ArrayList<Posts> data = da.getPost(idpost);

            if (data.isEmpty() || idpost == -1) {
                available = false;
        
      out.write("\n");
      out.write("        <h1>POST NOT FOUND!!!</h1>\n");
      out.write("        ");

            } else {
                Posts temp = data.get(0);
                String nama = da.getUser(temp.getUsers().getIdUser()).get(0).getName();

                out.println("<br><hr>");
                out.println("Name: " + nama + "<br><br><br>");
                out.println("Title: " + temp.getTitle() + "<br><br><br>");
                out.println("Post Type: " + temp.getPostType() + "<br><br><br>");
                out.println("Content: " + temp.getContent() + "<br><br><br>");
                out.println("Date: " + temp.getPostDate() + "<br><br><br>");

                out.println("<hr>");
            }
            ArrayList<Comments> temp = da.getComment(idpost);
            if (available) {
        
      out.write("\n");
      out.write("        <h2>Comments(");
      out.print(temp.size());
      out.write(") :</h2>");

            }
            for (int i = 0; i < temp.size(); i++) {
                String nama = da.getUser(temp.get(i).getUsers().getIdUser()).get(0).getName();
                out.println("<br>");
                out.println("Name: " + nama + "<br><br><br>");
                out.println("Isi Comment:  " + temp.get(i).getContent() + "<br><br><br>");
                out.println("Date: " + temp.get(i).getCommentDate() + "<br><br><br>");
                out.println("<hr>");
            }

            if (available) {


        
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"CommentServlet?post=");
      out.print(idpost);
      out.write("\" id=\"commentform\" method=\"post\">\n");
      out.write("\n");
      out.write("            Your Comment:\n");
      out.write("            <textarea rows=\"4\" cols=\"50\" name=\"isicomment\" form=\"commentform\" required></textarea><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <input type=\"submit\">\n");
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
