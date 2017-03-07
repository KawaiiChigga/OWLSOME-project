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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Home</title>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            String name = (String) session.getAttribute("username");
        
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=jquery-1.11.3.min.js></script>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("\r\n");
      out.write("                $(\"#postform\").hide();\r\n");
      out.write("\r\n");
      out.write("                $(\"#button1\").click(function () {\r\n");
      out.write("                    $(\"#postform\").toggle(750);\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div style=\"margin-bottom :10px;\">\r\n");
      out.write("        <form action=\"PostServlet\" id=\"postform\" method=\"post\">\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><p style=\"font-family:Trebuchet MS; font-size:22px; color: #193149\">\r\n");
      out.write("                            <b>TITLE</b> </p>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"title\" required \r\n");
      out.write("                               style=\"font-size: 22px; margin-left: 10px\">\r\n");
      out.write("                    </td>\r\n");
      out.write("\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><p style=\"font-family:Trebuchet MS; font-size:22px; color: #193149\">\r\n");
      out.write("                            <b>CONTENT</b> </p>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <textarea rows=\"5\" cols=\"100\" name=\"isipost\" form=\"postform\" required style=\"margin-left: 10px\"></textarea>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><p style=\"font-family:Trebuchet MS; font-size:22px; color: #193149\">\r\n");
      out.write("                            <b>TYPE</b> </p>\r\n");
      out.write("                    </td>\r\n");
      out.write("\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <select name=\"type\">\r\n");
      out.write("                            <option value=\"games\" style=\"font-family:Trebuchet MS; font-size:14px\">Games</option>\r\n");
      out.write("                            <option value=\"education\" style=\"font-family:Trebuchet MS; font-size:14px\">Education</option>\r\n");
      out.write("                            <option value=\"lifestyle\" style=\"font-family:Trebuchet MS; font-size:14px\">Lifestyle</option>\r\n");
      out.write("                            <option value=\"sport\" style=\"font-family:Trebuchet MS; font-size:14px\">Sport</option>\r\n");
      out.write("                            <option value=\"coding\" style=\"font-family:Trebuchet MS; font-size:14px\">Coding</option>\r\n");
      out.write("                            <option value=\"traveling\" style=\"font-family:Trebuchet MS; font-size:14px\">Traveling</option>\r\n");
      out.write("                            <option value=\"economics\" style=\"font-family:Trebuchet MS; font-size:14px\">Economics</option>\r\n");
      out.write("                            <option value=\"movies\" style=\"font-family:Trebuchet MS; font-size:14px\">Movies</option>\r\n");
      out.write("                            <option value=\"otomotif\" style=\"font-family:Trebuchet MS; font-size:14px\">Otomotif</option>\r\n");
      out.write("                            <option value=\"politics\" style=\"font-family:Trebuchet MS; font-size:14px\">Politics</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    \r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input style=\" background-color:#193149; color:white; font-family:tahoma; font-size:18px; margin-left: 10px\" value=\"Upload\" type=\"submit\">\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("        </form>\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("        <button style=\" width: 100%;height: 40px; background-color:#193149; color:whitesmoke; font-family:Trebuchet MS; font-size:20px;\" id=\"button1\">POST</button>\r\n");
      out.write("        \r\n");
      out.write("        </div>    \r\n");
      out.write("        ");
            if (request.getParameter("type") == null) {

        
      out.write("\r\n");
      out.write("        <style>\r\n");
      out.write("            a {\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                font-family:Trebuchet MS;\r\n");
      out.write("                color: #193149;\r\n");
      out.write("            }\r\n");
      out.write("            .url {\r\n");
      out.write("                width:100%; \r\n");
      out.write("                height: 70px; \r\n");
      out.write("                padding-top:1px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                margin-bottom: 5px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        <a href=\"home.jsp?type=games\">\r\n");
      out.write("            <div class=\"url\" style=\"background-color: #ffcc00\">\r\n");
      out.write("                <h1><b>GAMES</b></h1>\r\n");
      out.write("            </div>\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"home.jsp?type=education\">\r\n");
      out.write("            <div class=\"url\" style=\"background-color: #f9c806\">\r\n");
      out.write("                <h1><b>EDUCATION</b></h1>\r\n");
      out.write("            </div>\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"home.jsp?type=lifestyle\">\r\n");
      out.write("            <div class=\"url\" style=\"background-color: #f2c40d\">\r\n");
      out.write("                <h1><b>LIFESTYLE</b></h1>\r\n");
      out.write("            </div>\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"home.jsp?type=sport\">\r\n");
      out.write("            <div class=\"url\" style=\"background-color: #ecc113\">\r\n");
      out.write("                <h1><b>SPORT</b></h1>\r\n");
      out.write("            </div>\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"home.jsp?type=coding\">\r\n");
      out.write("            <div class=\"url\" style=\"background-color: #e6bd19\">\r\n");
      out.write("                <h1><b>CODING</b></h1>\r\n");
      out.write("            </div>\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"home.jsp?type=traveling\">\r\n");
      out.write("            <div class=\"url\" style=\"background-color: #dfb920\">\r\n");
      out.write("                <h1><b>TRAVELING</b></h1>\r\n");
      out.write("            </div>\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"home.jsp?type=economics\">\r\n");
      out.write("            <div class=\"url\" style=\"background-color: #d9b526\">\r\n");
      out.write("                <h1><b>ECONOMICS</b></h1>\r\n");
      out.write("            </div>\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"home.jsp?type=movies\">\r\n");
      out.write("            <div class=\"url\" style=\"background-color: #d2b12d\">\r\n");
      out.write("                <h1><b>MOVIES</b></h1>\r\n");
      out.write("            </div>\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"home.jsp?type=otomotif\">\r\n");
      out.write("            <div class=\"url\" style=\"background-color: #ccad33\">\r\n");
      out.write("                <h1><b>OTOMOTIF</b></h1>\r\n");
      out.write("            </div>\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"home.jsp?type=politics\">\r\n");
      out.write("            <div class=\"url\" style=\"background-color: #c6aa39\">\r\n");
      out.write("                <h1><b>POLITICS</b></h1>\r\n");
      out.write("            </div>\r\n");
      out.write("        </a>\r\n");
      out.write("<!--        <h1><a style=\"font-family:Trebuchet MS; font-size:26px; color: #193149\" href=\"home.jsp?type=education\"><b>EDUCATION</b></a></h1>\r\n");
      out.write("        <h1><a style=\"font-family:Trebuchet MS; font-size:26px; color: #193149\" href=\"home.jsp?type=lifestyle\"><b>LIFESTYLE</b></a></h1>\r\n");
      out.write("        <h1><a style=\"font-family:Trebuchet MS; font-size:26px; color: #193149\" href=\"home.jsp?type=sport\"><b>SPORT</b></a></h1>\r\n");
      out.write("        <h1><a style=\"font-family:Trebuchet MS; font-size:26px; color: #193149\" href=\"home.jsp?type=coding\"><b>CODING</b></a></h1>\r\n");
      out.write("        <h1><a style=\"font-family:Trebuchet MS; font-size:26px; color: #193149\" href=\"home.jsp?type=traveling\"><b>TRAVELING</b></a></h1>\r\n");
      out.write("        <h1><a style=\"font-family:Trebuchet MS; font-size:26px; color: #193149\" href=\"home.jsp?type=economics\"><b>ECONOMICS</b></a></h1>\r\n");
      out.write("        <h1><a style=\"font-family:Trebuchet MS; font-size:26px; color: #193149\" href=\"home.jsp?type=movies\"><b>MOVIES</b></a></h1>\r\n");
      out.write("        <h1><a style=\"font-family:Trebuchet MS; font-size:26px; color: #193149\" href=\"home.jsp?type=otomotif\"><b>OTOMOTIF</b></a></h1>\r\n");
      out.write("        <h1><a style=\"font-family:Trebuchet MS; font-size:26px; color: #193149\" href=\"home.jsp?type=politics\"><b>POLITICS</b></a></h1>-->\r\n");
      out.write("        ");
        } else {
            String type = request.getParameter("type");
            DataAkses da = new DataAkses();
            ArrayList<Posts> data = new ArrayList<Posts>();
            data = da.getAllPost(type);
            if (data.isEmpty()) {
        
      out.write("\r\n");
      out.write("        <h1>There is no Post(s) in this Category :'(</h1>\r\n");
      out.write("\r\n");
      out.write("        ");

        } else {
            Collections.reverse(data);
            ArrayList<Users> u = da.getUser(name);
            for (int i = 0; i < data.size(); i++) {
                Posts temp = data.get(i);
                String nama = da.getUser(temp.getUsers().getIdUser()).get(0).getName();
                ArrayList<Comments> comments = da.getComment(temp.getIdPost());

                out.print("<span style='font-family:Trebuchet MS; color: #193149'><br><hr>");
                out.print("<h2>" + nama + "</h2>");
                out.print("<p style='font-size:20px;'>===== " + temp.getTitle() + " =====</p>");
                out.print("<p style='font-size:14px;'> " + temp.getContent() + "</p>");
                out.print("<p style='font-size:11px;'> Post Type: " + temp.getPostType() + " | Date: " + temp.getPostDate() + "</p><br><br></span>");

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
        
      out.write("\r\n");
      out.write("        <span style='font-family:Trebuchet MS; font-size:16px; color: #193149'>\r\n");
      out.write("            <a href=\"VoteServlet?type=");
      out.print(type);
      out.write("&vote=1&post=");
      out.print(temp.getIdPost());
      out.write("\">LIKE</a>(");
      out.print(like);
      out.write(")<a href=\"VoteServlet?type=");
      out.print(type);
      out.write("&vote=2&post=");
      out.print(temp.getIdPost());
      out.write("\">|DISLIKE</a>(");
      out.print(dislike);
      out.write(")\r\n");
      out.write("            ");

            } else if (votes.get(j).getVote() == 1)//kalo votenya LIKE
            {
            
      out.write("\r\n");
      out.write("            LIKE (you already choose this)(");
      out.print(like);
      out.write(")<a href=\"VoteServlet?type=");
      out.print(type);
      out.write("&vote=2&idvote=");
      out.print(votes.get(j).getIdVote());
      out.write("&post=");
      out.print(temp.getIdPost());
      out.write("\">|DISLIKE</a>(");
      out.print(dislike);
      out.write(")\r\n");
      out.write("            ");

            } else if (votes.get(j).getVote() == 2)//kalo votenya DISLIKE
            {
            
      out.write("\r\n");
      out.write("            <a href=\"VoteServlet?type=");
      out.print(type);
      out.write("&vote=1&idvote=");
      out.print(votes.get(j).getIdVote());
      out.write("&post=");
      out.print(temp.getIdPost());
      out.write("\">LIKE</a>(");
      out.print(like);
      out.write(")|DISLIKE(you already choose this)(");
      out.print(dislike);
      out.write(")\r\n");
      out.write("            ");

                }

            
      out.write("\r\n");
      out.write("            <br><br><a href=\"comment.jsp?post=");
      out.print(temp.getIdPost());
      out.write("\">Comments (");
      out.print(comments.size());
      out.write(")</a>\r\n");
      out.write("            ");

                        out.println("<hr> </span>");

                    }
                }
            
      out.write("\r\n");
      out.write("        </span>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
