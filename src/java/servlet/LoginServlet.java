/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import model.User;
import service.AccountService;

/**
 *
 * @author danny
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        String logout = request.getParameter("logout");
        
        if (logout != null) {
            session.invalidate();
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            request.setAttribute("message", "You have successfully logged out.");
            
        }
        else if (session.getAttribute("username") != null) {
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String username = request.getParameter("usernameInput");
        String password = request.getParameter("passwordInput");
        
        if ((!username.equals("") || !password.equals(""))) {
            AccountService test = new AccountService();
            User check = test.login(username, password);
            if (check == null) {
                request.setAttribute("message", "Invalid login.");
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            }
            else {
                session.setAttribute("username", username);
                response.sendRedirect("home");
            }
        }
        else {
            request.setAttribute("message", "Enter username and password");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }


}
