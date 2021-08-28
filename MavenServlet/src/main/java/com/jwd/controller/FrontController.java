package com.jwd.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;


public class FrontController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {


            final double operand = Double.parseDouble(req.getParameter("operand"));
            final double exponent = Double.parseDouble(req.getParameter("exp"));
            final double result = Math.pow(operand, exponent);
            req.setAttribute("result", String.valueOf(result));


        }catch (Exception e){
            req.setAttribute("result", "Invalid input. Check your parameters.");
        }
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
