package com.unesa.integrador.controller;

import com.unesa.integrador.model.Financeira;
import com.unesa.integrador.repository.FinanceiraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterUserController {

    @Autowired
    FinanceiraRepository financeiraRepository;

    @GetMapping("/register")
    public String registerPage(ModelMap model) {
        model.addAttribute("registerobject", new Financeira());
        return "registerpage";
    }

    @PostMapping("/register")
    public String submitregister(ModelMap model, @ModelAttribute("registerobject")Financeira financeira, BindingResult result) {
        financeira.setId(financeiraRepository.getMaxId() + 1);
        System.out.println(financeira.toString());
        financeiraRepository.save(financeira);
        return "redirect:/";
    }

}
