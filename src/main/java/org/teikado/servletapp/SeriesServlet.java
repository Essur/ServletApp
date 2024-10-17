package org.teikado.servletapp;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.teikado.servletapp.model.SeriesCalculator;

@WebServlet(name = "seriesServlet", value = "/series-servlet")
public class SeriesServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double x = Double.parseDouble(request.getParameter("x"));
        int n = Integer.parseInt(request.getParameter("n"));
        double e = Double.parseDouble(request.getParameter("e"));

        SeriesCalculator calculator = new SeriesCalculator(x, n);

        double sum = calculator.calculateSeriesSum();
        double limitedSum = calculator.calculateLimitedSum(e);
        double exactValue = calculator.compareWithExact();

        request.setAttribute("sum", sum);
        request.setAttribute("limitedSum", limitedSum);
        request.setAttribute("exactValue", exactValue);

        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
        dispatcher.forward(request, response);
    }
    public void destroy() {
    }
}