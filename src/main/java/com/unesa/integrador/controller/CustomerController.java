package com.unesa.integrador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    @GetMapping("/addcustomer")
    public static String registerCustomer() {
        return "customerregisterpage";
    }

    @GetMapping("/loanpage")
    public static String simulateLoan() {
        return "customerloanpage";
    }
}
