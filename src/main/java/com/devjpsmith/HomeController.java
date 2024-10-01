package com.devjpsmith;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"/", "home"})
    public String index() {
        return "home";
    }

    @RequestMapping("addjob")
    public String addJob() {
        return "addjob";
    }

    @RequestMapping("viewalljobs")
    public String viewAllJobs() {
        return "viewalljobs";
    }
}
