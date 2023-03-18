package com.yeonfish.voteservice.controllers;

import com.yeonfish.voteservice.beans.vo.UserVO;
import com.yeonfish.voteservice.services.UserManagingService;
import com.yeonfish.voteservice.util.RsaCrypto;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
import java.security.PrivateKey;
import java.util.HashMap;

@RestController
@RequestMapping("/endpoint/*")
public class MainController {

    @Autowired
    private UserManagingService userManagingService;

    @PostMapping("login")
    public Boolean login(@RequestParam(name = "id", required = true) String id, @RequestParam(name = "pw", required = true) String pw, @CookieValue(value = "sessionId", required = true) Cookie sessionId, HttpServletRequest req) {
        HttpSession session = req.getSession();

        HashMap<String, String> keypair = (HashMap) session.getAttribute(sessionId+"_keypair");

        pw = RsaCrypto.decrypt(pw, keypair.get("privateKey"));

        UserVO userVO = new UserVO();
        userVO.setId(id);
        userVO.setPassword(pw);

        UserVO DBData = userManagingService.login(userVO);
        if (DBData == null) {
            return false;
        } else {
            session.setAttribute(sessionId+"_User", DBData);
            return true;
        }
    }
}
