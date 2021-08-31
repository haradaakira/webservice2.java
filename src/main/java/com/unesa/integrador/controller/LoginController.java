package com.unesa.integrador.controller;

import com.unesa.integrador.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @Autowired
    static EnderecoRepository a;

    @GetMapping("/")
    public static String redirectLoginPage() {
        return "redirect:/login";
    }

    @GetMapping("/login")
    public static String loginPage() {
//        System.out.println(a.findById("1").get().getBairro());
        return "loginpage";
    }

}
