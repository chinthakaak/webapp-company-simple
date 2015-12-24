package com.examples.company.controller;

import com.examples.company.model.ModelCompany;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ka40215 on 12/24/15.
 */
public class ControllerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ModelCompany company = new ModelCompany();
        resp.getWriter().println(company.getMessage());
    }
}
