package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Users;
import model.Votes;
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
      out.write("        <title>Comment</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");


            String name = (String) session.getAttribute("username");
        
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("        ");
            int idpost = -1;
            if (request.getParameter("post") != null) {
                idpost = Integer.parseInt(request.getParameter("post"));

            }

        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <h1>POST idnya= ");
      out.print(idpost);
      out.write("</h1>\r\n");
      out.write("\r\n");
      out.write("        ");

            Boolean available = true;
            DataAkses da = new DataAkses();
            ArrayList<Posts> data = da.getPost(idpost);
            ArrayList<Users> u = da.getUser(name);
            if (data.isEmpty() || idpost == -1) {
                available = false;
        
      out.write("\r\n");
      out.write("        <h1>POST NOT FOUND!!!</h1>\r\n");
      out.write("        ");

            } else {
                Posts temp = data.get(0);
                String nama = da.getUser(temp.getUsers().getIdUser()).get(0).getName();

                out.print("<span style='font-family:Trebuchet MS; color: #193149'><br><hr>");
                out.print("<h2>" + nama + "</h2>");
                out.print("<p style='font-size:20px;'>===== " + temp.getTitle() + " =====</p>");
                out.print("<p style='font-size:14px;'> " + temp.getContent() + "</p>");
                out.print("<p style='font-size:11px;'> Post Type: " + temp.getPostType() + " | Date: " + temp.getPostDate() +"</p><br><br>");
                out.println("<hr></span>");


            }
            ArrayList<Comments> temp = da.getComment(idpost);
            if (available) {
        
      out.write("\r\n");
      out.write("        <h2>Comments(");
      out.print(temp.size());
      out.write(") :</h2>");

            }
            for (int i = 0; i < temp.size(); i++) {
                String nama = da.getUser(temp.get(i).getUsers().getIdUser()).get(0).getName();
                out.print("<span style='font-family:Trebuchet MS;color: #193149'><br>");
                out.print("<h3>" + nama + "</h3><br>");
                out.print("<p style='font-size:14px;'>" + temp.get(i).getContent() + "</p><br><br><br>");
                out.print("<p style='font-size:11px;'>Date: " + temp.get(i).getCommentDate() + "</p><br><br><br></span>");

                boolean ada = false;
                ArrayList<Votes> votes = da.getVoteComment(temp.get(i).getIdComment());
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
      out.write("        <span style='font-family:Trebuchet MS; font-size:20px; color: #193149' >\r\n");
      out.write("        <a  href=\"VoteServlet?c=c&vote=1&post=");
      out.print(data.get(0).getIdPost());
      out.write("&comment=");
      out.print(temp.get(i).getIdComment());
      out.write("\">LIKE</a>(");
      out.print(like);
      out.write(")<a href=\"VoteServlet?c=c&vote=2&post=");
      out.print(data.get(0).getIdPost());
      out.write("&comment=");
      out.print(temp.get(i).getIdComment());
      out.write("\">|[DISLIKE]</a>(");
      out.print(dislike);
      out.write(")\r\n");
      out.write("        ");

        } else if (votes.get(j).getVote() == 1)//kalo votenya LIKE
        {
        
      out.write("\r\n");
      out.write("        [LIKE (you already choose this)](");
      out.print(like);
      out.write(")<a href=\"VoteServlet?c=c&vote=2&post=");
      out.print(data.get(0).getIdPost());
      out.write("&idvote=");
      out.print(votes.get(j).getIdVote());
      out.write("&comment=");
      out.print(temp.get(i).getIdComment());
      out.write("\"> | DISLIKE</a>(");
      out.print(dislike);
      out.write(")\r\n");
      out.write("        ");

        } else if (votes.get(j).getVote() == 2)//kalo votenya DISLIKE
        {
        
      out.write("\r\n");
      out.write("        <a  href=\"VoteServlet?c=c&vote=1&post=");
      out.print(data.get(0).getIdPost());
      out.write("&idvote=");
      out.print(votes.get(j).getIdVote());
      out.write("&comment=");
      out.print(temp.get(i).getIdComment());
      out.write("\">[LIKE]</a>(");
      out.print(like);
      out.write(")|[DISLIKE(you already choose this)](");
      out.print(dislike);
      out.write(")\r\n");
      out.write("        ");

            }

     
                out.println("<hr></span>");

            }
      

        if (available) {


        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <form action=\"CommentServlet?post=");
      out.print(idpost);
      out.write("\" id=\"commentform\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("            Your Comment:\r\n");
      out.write("            <textarea rows=\"4\" cols=\"50\" name=\"isicomment\" form=\"commentform\" required></textarea><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <input type=\"submit\">\r\n");
      out.write("        </form>\r\n");
      out.write("        ");
}
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
