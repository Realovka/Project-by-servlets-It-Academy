package by.realovka.web.app.controller;

import by.realovka.web.dao.dto.TrainerDTO;
import by.realovka.web.dao.model.Admin;
import by.realovka.web.dao.model.Student;
import by.realovka.web.dao.model.Trainer;
import by.realovka.web.dao.model.User;
import by.realovka.web.service.service.TrainerService;
import by.realovka.web.service.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping(path = "/auth")
public class AuthorizationController {

    private final UserService userService;
    private final TrainerService trainerService;

    @PostMapping
    public ModelAndView authorizationUser(HttpServletRequest req, HttpServletResponse resp, ModelAndView modelAndView) throws Exception {
        User auth = (User) req.getSession().getAttribute("userAuth");
        forwardToSomeMainPage(auth, modelAndView);
        return modelAndView;
    }

    private void forwardToSomeMainPage(User auth, ModelAndView modelAndView) {
        if (auth instanceof Admin) {
            List<TrainerDTO> trainers = trainerService.getAllTrainers();
            modelAndView.addObject("listTrainers", trainers);
            modelAndView.setViewName("mainAdmin");
        } else {
            if (auth instanceof Trainer) {
                Trainer trainer = userService.getById(auth.getId());
                if (trainer.getGroup() != null) {
                    List<Student> students = trainer.getGroup().getStudents();
                    modelAndView.addObject("listStudents", students);
                    modelAndView.setViewName("mainTrainer");
                }
            } else {
                if (auth instanceof Student) {
                    modelAndView.setViewName("mainStudent");
                }
            }
        }
    }
}