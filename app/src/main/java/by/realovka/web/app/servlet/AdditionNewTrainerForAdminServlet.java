package by.realovka.web.app.servlet;

import by.realovka.web.service.service.TrainerService;
import by.realovka.web.service.service.TrainerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/addTrainer")
public class AdditionNewTrainerForAdminServlet extends HttpServlet {

    private final TrainerService trainerService = TrainerServiceImpl.getInstance();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String trainerName = req.getParameter("trainerName");
        if (!trainerService.addTrainer(trainerName)) {
            req.getSession().setAttribute("suchTrainerAlreadyExist", "Such trainer already exist");
            try {
                req.getRequestDispatcher("addTrainer.jsp").forward(req, resp);
            } catch (ServletException | IOException e) {
                e.printStackTrace();
            }
        }
        req.getRequestDispatcher("/listAllTrainers.jsp").forward(req, resp);
    }
}
