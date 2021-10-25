package com.unesa.integrador.controller;

import com.unesa.integrador.repository.PessoaFisicaRepository;
import com.unesa.integrador.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TableController {

    @Autowired
    PessoaFisicaRepository pessoaFisicaRepository;

    @Autowired
    SessionRepository sessionRepository;

    @GetMapping("/loantable")
    public String showCustomerTable(ModelMap model){
        model.put("customer", pessoaFisicaRepository.findBySessionOwner(sessionRepository.getDbSessionId()));
        return "customertable";
    }
}
