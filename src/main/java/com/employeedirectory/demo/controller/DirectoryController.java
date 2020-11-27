package com.employeedirectory.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
public class DirectoryController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @GetMapping({"/", "directory"})
    public String directory(@RequestParam(required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "employee-directory";
    }
}

