package com.unesa.integrador.controller;

import com.unesa.integrador.model.Financeira;
import com.unesa.integrador.model.SessionID;
import com.unesa.integrador.repository.FinanceiraRepository;
import com.unesa.integrador.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.transaction.Transactional;
import java.util.Objects;

@Controller
public class LoginController {

    @Autowired
    FinanceiraRepository financeiraRepository;

    @Autowired
    SessionRepository sessionRepository;

    @GetMapping("/")
    public static String redirectLoginPage() {
        return "redirect:/login";
    }

    @GetMapping("/login")
    public static String loginPage(ModelMap model) {
        model.addAttribute("loginobject", new Financeira());
        return "loginpage";
    }

    @Transactional
    @PostMapping("/login")
    public String loginValidator(ModelMap model, @ModelAttribute("loginobject") Financeira financeira, BindingResult result) {
        Financeira fromdb = financeiraRepository.findByCNPJ(financeira.getCnpj());
        if (financeira.getSenha() == null || Objects.equals(financeira.getSenha(), "")) {
            return "redirect:/login";
        }
        try {
            if (Objects.equals(fromdb.getSenha(), financeira.getSenha())) {
                SessionID sessionID = new SessionID();
                sessionID.setSessionId(fromdb.getId().toString());
                sessionRepository.setDbSessionId(fromdb.getId().toString());
                return "redirect:/menu";
            }
        } catch (Exception err) {
            System.err.println(" > " + err);
            return "redirect:/login";
        }
        return "redirect:/login";
    }

    @Transactional
    @GetMapping("/logout")
    public String logout() {
        sessionRepository.removeDbSessionId();
        return "redirect:/login";
    }
}