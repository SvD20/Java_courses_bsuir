package edu.bsuir.ris2.servlets;

import edu.bsuir.ris2.sessionbeans.WorkWithFaculties;
import java.io.*;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/mainservlet")
public class HelloServlet extends HttpServlet {

    @EJB
    private WorkWithFaculties workWithFaculties;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        try {
            writer.println("<p>The most popular faculties: " + workWithFaculties.searchFaculties() + "</p>");

        } finally {
            writer.close();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        int years = Integer.parseInt(request.getParameter("years"));
        String faculty = request.getParameter("faculty");
        double payment = workWithFaculties.calculateOfPayment(faculty,years);

        try {
            writer.println("<p>Your payment: " + payment + "</p>");

        } finally {
            writer.close();
        }
    }

}