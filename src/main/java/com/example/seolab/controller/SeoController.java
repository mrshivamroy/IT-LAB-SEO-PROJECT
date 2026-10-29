package com.example.seolab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SeoController {

    /**
     * Maps the root URL (http://localhost:8080/)
     * Returns "index" -> renders src/main/resources/templates/index.html
     */
    @GetMapping("/")
    public String index() {
        return "index";
    }

    /**
     * Maps the About URL (http://localhost:8080/about)
     * Returns "about" -> renders src/main/resources/templates/about.html
     */
    @GetMapping("/about")
    public String about() {
        return "about";
    }
}