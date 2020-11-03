package gergely.urban.bollerbl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private static final String HOME_URL="/";
    private static final String EXAMPLE_URL="/valami";

    @GetMapping(HOME_URL)
    public String homePage(){
        return "home";
    }

    @GetMapping(EXAMPLE_URL)
    public String valami(){
        return "Alma a fa alatt";
    }
}
