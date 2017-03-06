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
import model.Users;

/**
 *
 * @author Kevin
 */
@WebServlet(name = "ProfileServlet", urlPatterns = {"/ProfileServlet"})
public class ProfileServlet extends HttpServlet {

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
          HttpSession session = request.getSession();
        String usrname = (String) session.getAttribute("username");
        
        String username = request.getParameter("username");
        String password = request.getParameter("pass");
        String opassword = request.getParameter("opass");
        String email = request.getParameter("email");
        String confirmpassword = request.getParameter("cpass");
        String name = request.getParameter("nama");
        int age = Integer.parseInt(request.getParameter("age"));
        DataAkses da = new DataAkses();
        ArrayList<Users> u = da.getUser(usrname);
        Users user = u.get(0);
        System.out.println("o"+opassword);
        System.out.println("p"+password);
        System.out.println("u"+user.getPassword());
        System.out.println("c"+confirmpassword);
         if(password.equals("") && confirmpassword.equals("") && opassword.equals("")){
             if (da.updateUser(user.getIdUser(), new Users(username, user.getPassword(), name, age, email, user.getGender(), "user", ""))) {

                session.setAttribute("username", username);
                response.sendRedirect("home.jsp");
            } else {
                response.sendRedirect("profile.jsp?error=2");
            }
        }
        else if (opassword.equals(user.getPassword())&&password.equals(confirmpassword)) {
            if (da.updateUser(user.getIdUser(), new Users(username, password, name, age, email, user.getGender(), "user", ""))) {

                session.setAttribute("username", username);
                response.sendRedirect("home.jsp");
            } else {
                response.sendRedirect("profile.jsp?error=2");
            }
        } else {
            response.sendRedirect("profile.jsp?error=1");
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
