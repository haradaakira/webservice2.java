package com.unesa.integrador.repository;

import com.unesa.integrador.model.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, String> {
    List<PessoaFisica> findAll();
}
