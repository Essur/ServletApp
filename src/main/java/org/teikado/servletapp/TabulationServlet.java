package org.teikado.servletapp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.teikado.servletapp.model.TabulationService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="TabulationServlet", value = "/tabulate")
public class TabulationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double a = Double.parseDouble(request.getParameter("a"));
        double b = Double.parseDouble(request.getParameter("b"));
        double h = Double.parseDouble(request.getParameter("h"));
        TabulationService service = new TabulationService();

        List<String> results = new ArrayList<>();

        if (a >= b) {
            results.add("<p style='color:red;'>Error: The starting value 'a' must be less than the end value 'b'.</p>");
        } else if (h <= 0) {
            results.add("<p style='color:red;'>Error: Step size 'h' must be greater than 0.</p>");
        } else {
            results = service.getTabulationResult(a, b, h);
        }

        request.setAttribute("results", results);
        request.getRequestDispatcher("/tabulationResults.jsp").forward(request, response);
    }
}