package com.unesa.integrador.controller;

import com.unesa.integrador.model.PessoaFisica;
import com.unesa.integrador.repository.PessoaFisicaRepository;
import com.unesa.integrador.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @Autowired
    PessoaFisicaRepository pessoaFisicaRepository;

    @Autowired
    SessionRepository sessionRepository;

    @GetMapping("/addcustomer")
    public String registerCustomer(ModelMap model) {
        model.addAttribute("registercustomerobject", new PessoaFisica());
        return "customerregisterpage";
    }

    @PostMapping
    public String submitCustomer(ModelMap model, @ModelAttribute("registercustomerobject")PessoaFisica pessoaFisica, BindingResult result) {
        pessoaFisica.setId(pessoaFisicaRepository.getMaxId() + 1);
        pessoaFisica.setSessionowner(sessionRepository.getDbSessionId());
        System.out.println(pessoaFisica.toString());
        pessoaFisicaRepository.save(pessoaFisica);
        return "redirect:/menu/";
    }

    @GetMapping("/loanpage")
    public static String simulateLoan() {
        return "customerloanpage";
    }
}
