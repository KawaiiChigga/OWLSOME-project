/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controller.DataAkses;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Posts;
import model.Users;
import model.Votes;

/**
 *
 * @author Kevin
 */
@WebServlet(name = "VoteServlet", urlPatterns = {"/VoteServlet"})
public class VoteServlet extends HttpServlet {

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

        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        if (username == null) {
            response.sendRedirect("login.jsp");
        } else {
            boolean pernah = false;
            Integer idvote = 0;
            if (request.getParameter("idvote") != null) {
                pernah = true;
                idvote = Integer.parseInt(request.getParameter("idvote"));
            }

            Integer vote = Integer.parseInt(request.getParameter("vote"));
            Integer idpost = Integer.parseInt(request.getParameter("post"));

            DataAkses da = new DataAkses();
            ArrayList<Users> user = da.getUser(username);
            ArrayList<Posts> post = da.getPost(idpost);
            Votes v;
            if (pernah) {

            if (da.updateVote(idvote, vote)) {
                response.sendRedirect("home.jsp");
            } else {

                response.sendRedirect("home.jsp?status=votefail");
            }
                v = new Votes(post.get(0), user.get(0), idvote, vote);
            } else {

                v = new Votes(post.get(0), user.get(0), 0, vote);
                if (da.insertVote(v)) {
                    response.sendRedirect("home.jsp");
                } else {

                    response.sendRedirect("home.jsp?status=votefail");
                }
            }
        }

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
