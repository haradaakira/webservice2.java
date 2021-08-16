package com.unesa.integrador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public static String redirectLoginPage() {
        return "redirect:/login";
    }

    @GetMapping("/login")
    public static String loginPage() {

        return "loginpage";
    }

}
