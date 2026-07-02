package com.example;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 * LoginServlet - Handles login form submissions.
 *
 * @WebServlet maps this servlet to the /login URL pattern.
 * No need to configure web.xml when using annotations.
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    /**
     * doGet() - Called when user visits /login in browser.
     * Forwards to the login form (login.jsp).
     */
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        // Forward to login page
        RequestDispatcher dispatcher =
                request.getRequestDispatcher("/login.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * doPost() - Called when form is submitted (method="post").
     * Validates credentials and redirects accordingly.
     */
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        // 1. Read form parameters
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // 2. Create User object and validate
        User user = new User(username, password);

        if (user.validate()) {
            // 3a. Valid: create session and go to welcome page
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("welcome.jsp");
        } else {
            // 3b. Invalid: set error message and go to error page
            request.setAttribute("errorMessage",
                    "Invalid username or password. Please try again.");
            RequestDispatcher dispatcher =
                    request.getRequestDispatcher("/error.jsp");
            dispatcher.forward(request, response);
        }
    }
}
