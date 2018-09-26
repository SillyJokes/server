package com.sillyjokes.server.controllers;

//external imports from Springboot for MVC
import com.sillyjokes.server.repositories.JokesRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

//java imports for classes to help make our server/controller work
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

//This controller helps manage all of the joke content
@Controller
public class JokesController {
    @Autowired
    JokesRespository jokesRespository;

    @GetMapping("/home")
    public ModelAndView proofLifeHome(HttpServletRequest request, Model model) {
        ModelAndView modelAndView = new ModelAndView();

        HttpSession session = request.getSession();
        System.out.println("SESSION:" + session);

        modelAndView.setViewName("home");

        return modelAndView;
    }
}
