package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Votes;
import model.Comments;
import java.util.Collections;
import java.util.Collection;
import model.Posts;
import model.Users;
import java.util.ArrayList;
import controller.DataAkses;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");


            String name = (String) session.getAttribute("username");
        
      out.write("\n");
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
      out.write("\n");
      out.write("\n");
      out.write("        <script src=jquery-1.11.3.min.js></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("\n");
      out.write("                $(\"#postform\").hide();\n");
      out.write("\n");
      out.write("                $(\"#button1\").click(function () {\n");
      out.write("                    $(\"#postform\").toggle(750);\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"PostServlet\" id=\"postform\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td><p style=\"font-family:Trebuchet MS; font-size:22px; color: #193149\">\n");
      out.write("                            <b>TITLE</b> </p>\n");
      out.write("                    </td>\n");
      out.write("                    <td><input type=\"text\" name=\"title\" required \n");
      out.write("                               style=\"font-size: 22px; margin-left: 10px\">\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><p style=\"font-family:Trebuchet MS; font-size:22px; color: #193149\">\n");
      out.write("                            <b>CONTENT</b> </p>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <textarea rows=\"5\" cols=\"100\" name=\"isipost\" form=\"postform\" required style=\"margin-left: 10px\"></textarea>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><p style=\"font-family:Trebuchet MS; font-size:22px; color: #193149\">\n");
      out.write("                            <b>TYPE</b> </p>\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                    <td><input  type=\"radio\" name=\"type\" value=\"games\" checked/><span style=\"font-family:Trebuchet MS; font-size:20px\">Games</span>\n");
      out.write("                        <input  type=\"radio\" name=\"type\" value=\"education\" /><span style=\"font-family:Trebuchet MS; font-size:20px\">Education  </span>\n");
      out.write("                        <input  type=\"radio\" name=\"type\" value=\"lifestyle\" /><span style=\"font-family:Trebuchet MS; font-size:20px\">Lifestyle</span>\n");
      out.write("                        <input style=\" background-color:#193149; color:white; font-family:tahoma; font-size:18px; margin-left: 10px\" type=\"submit\">\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <button id=\"button1\"> \n");
      out.write("            Show & Hide \n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("        ");
            DataAkses da = new DataAkses();
            ArrayList<Posts> data = new ArrayList<Posts>();
            data = da.getAllPost();
            Collections.reverse(data);
            ArrayList<Users> u = da.getUser(name);

        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
            for (int i = 0; i < data.size(); i++) {
                Posts temp = data.get(i);
                String nama = da.getUser(temp.getUsers().getIdUser()).get(0).getName();
                ArrayList<Comments> comments = da.getComment(temp.getIdPost());

                out.println("<br><hr>");
                out.println("<h3>" + nama + "</h3><br>");
                out.println("Title: " + temp.getTitle() + "<br><br><br>");
                out.println("Post Type: " + temp.getPostType() + "<br><br><br>");
                out.println("Content: " + temp.getContent() + "<br><br><br>");
                out.println("Date: " + temp.getPostDate() + "<br><br><br>");

                boolean ada = false;
                ArrayList<Votes> votes = da.getVotePost(temp.getIdPost());
                int j = 0;
                int like = 0, dislike = 0;

                for (int k = 0; k < votes.size(); k++) {
                    if (votes.get(k).getVote() == 1) {
                        like++;
                    } else {
                        dislike++;
                    }
                    if (!u.isEmpty()) {

                        if (votes.get(k).getUsers().getIdUser() == u.get(0).getIdUser()) {
                            ada = true;
                            j = k;
                        }
                    }
                }
                if (ada == false) {
        
      out.write("\n");
      out.write("        <a href=\"VoteServlet?vote=1&post=");
      out.print(temp.getIdPost());
      out.write("\">[LIKE]</a>(");
      out.print(like);
      out.write(")<a href=\"VoteServlet?vote=2&post=");
      out.print(temp.getIdPost());
      out.write("\">|[DISLIKE]</a>(");
      out.print(dislike);
      out.write(")\n");
      out.write("        ");

        } else if (votes.get(j).getVote() == 1)//kalo votenya LIKE
        {
        
      out.write("\n");
      out.write("        [LIKE (you already choose this)](");
      out.print(like);
      out.write(")<a href=\"VoteServlet?vote=2&idvote=");
      out.print(votes.get(j).getIdVote());
      out.write("&post=");
      out.print(temp.getIdPost());
      out.write("\">|[DISLIKE]</a>(");
      out.print(dislike);
      out.write(")\n");
      out.write("        ");

        } else if (votes.get(j).getVote() == 2)//kalo votenya DISLIKE
        {
        
      out.write("\n");
      out.write("        <a href=\"VoteServlet?vote=1&idvote=");
      out.print(votes.get(j).getIdVote());
      out.write("&post=");
      out.print(temp.getIdPost());
      out.write("\">[LIKE]</a>(");
      out.print(like);
      out.write(")|[DISLIKE(you already choose this)](");
      out.print(dislike);
      out.write(")\n");
      out.write("        ");

            }

        
      out.write("\n");
      out.write("        <br><br><a href=\"comment.jsp?post=");
      out.print(temp.getIdPost());
      out.write("\">Comments (");
      out.print(comments.size());
      out.write(")</a>\n");
      out.write("        ");

                out.println("<hr>");

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
