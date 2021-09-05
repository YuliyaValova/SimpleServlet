package com.jwd.controller;

import com.jwd.controller.dao.Database;
import com.jwd.controller.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class FrontController extends HttpServlet {
    private final Database base = new Database();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            signUp(req);
            req.setAttribute("database", base.toString());
        } catch (Exception e) {
            req.setAttribute("successMessage", "Invalid input. Check your parameters.");
        }
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    private void signUp(HttpServletRequest req) {
        String login = req.getParameter("login");
        String password1 = req.getParameter("password1");
        String password2 = req.getParameter("password2"); //todo: service
        if (password1.equals(password2)) {
            if (!base.containsLogin(login)) {
                User user = new User(login, password1);
                base.putToMap(login, user);
                req.setAttribute("user", user.toString());
                req.setAttribute("successMessage", "Great! Now you have an account ^_^");  //todo: validation
            } else {
                req.setAttribute("successMessage", "Such user already exists -_-");
            }
        }else {
            req.setAttribute("successMessage", "Owww... your passwords are not equals _-_");
        }

    }
}
