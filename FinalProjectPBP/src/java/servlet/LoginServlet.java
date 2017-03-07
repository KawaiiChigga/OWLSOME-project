/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Users;
import controller.DataAkses;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Kevin
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        int idpost = Integer.parseInt(request.getParameter("post"));
        DataAkses da = new DataAkses();
        ArrayList<Users> u = da.getUser(username);
        if (u.size() > 0) {
            if (password.equals(u.get(0).getPassword())) {
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
                if (idpost == -1 && request.getParameter("type").equals("")) {

                    response.sendRedirect("home.jsp?status=1");
                } else if (!request.getParameter("type").equals("")) {

                    String type = request.getParameter("type");
                    response.sendRedirect("home.jsp?type=" + type);
                } else {

                    response.sendRedirect("comment.jsp?post=" + idpost);
                }

                //buat logout
//            HttpSession session=request.getSession();  
//            session.invalidate();  
            } else {
                response.sendRedirect("login.jsp?status=2");
            }
        } else {
            response.sendRedirect("login.jsp?status=2");
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
