package by.realovka.web.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping(path = "/choiceTrainerGetAverageSalary")
public class AdditionMonthsForAverageSalaryServlet {

    @GetMapping
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String trainerId = req.getParameter("trainerId");
        req.getSession().setAttribute("trainerId", trainerId);
        req.getRequestDispatcher("/monthsNumber.jsp").forward(req, resp);
    }
}