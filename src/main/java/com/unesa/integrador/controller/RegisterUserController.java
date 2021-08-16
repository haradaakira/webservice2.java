package com.unesa.integrador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterUserController {

    @GetMapping("/register")
    public static String registerPage() {

        return "registerpage";
    }

}
