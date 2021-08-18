package com.unesa.integrador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecoverPasswordController {

    @GetMapping("/recover")
    public static String recoverPasswordPage() {

        return "recoverpage";
    }

    @RequestMapping("/recovercode")
    public static String recoverCodePage() {

        return "recovervalidationpage";
    }

}
