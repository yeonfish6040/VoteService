package com.yeonfish.voteservice.controllers;

import com.yeonfish.voteservice.util.UUID;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("*")
public class WebController {
    @GetMapping("")
    public String main() {
        return "main";
    }

    private String addCookie(Cookie c, HttpServletResponse res) {
        String sessionId;
        if (c == null) {
            sessionId = UUID.generate();
            res.addCookie(new Cookie("sessionId", sessionId));
        }else {
            sessionId = c.getValue();
        }
        return sessionId;
    }
}
