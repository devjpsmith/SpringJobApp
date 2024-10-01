package com.devjpsmith.controllers;

import com.devjpsmith.models.JobPost;
import com.devjpsmith.services.JobService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    private final JobService _jobService;

    public HomeController(JobService jobService) {
        _jobService = jobService;
    }

    @GetMapping({"/", "home"})
    public String index() {
        return "home";
    }

    @GetMapping("addjob")
    public String addJob() {
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        _jobService.addJob(jobPost);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewAllJobs(Model model) {
        model.addAttribute("jobPosts", _jobService.getAllJobs());
//        mv.addObject("jobPosts", _jobService.getAllJobs());
        return "viewalljobs";
    }
}
