package by.realovka.web.app.servlet;

import by.realovka.web.dao.model.User;
import by.realovka.web.service.UserService;
import by.realovka.web.service.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@WebServlet (urlPatterns = "/addTheme")
public class NewThemeAdditionServlet extends HttpServlet {

    private final UserService userService = UserServiceImpl.getInstance();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User auth = (User) req.getSession().getAttribute("userAuth");
        String themeName = req.getParameter("themeName");
        req.getSession().setAttribute("theme",themeName);
        auth = userService.getTrainerAndHisStudentsAfterAddTheme(auth, themeName);
        log.info("Trainer after addition theme {}", auth);
        req.getRequestDispatcher("mainTrainer.jsp").forward(req, resp);
    }
}
