package com.unesa.integrador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @GetMapping("/menu")
    public static String mainMenu() {
        return "mainmenupage";
    }

    @GetMapping("/customer")
    public static String customerMenu() {
        return "customermenupage";
    }

}
