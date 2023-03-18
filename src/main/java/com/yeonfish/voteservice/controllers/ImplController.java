package com.yeonfish.voteservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/impl/*")
public class ImplController {
    @GetMapping("menu")
    public String menu() { return "menu"; }
}
