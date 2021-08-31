package com.unesa.integrador.repository;

import com.unesa.integrador.model.Financiamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FinanciamentoRepository extends JpaRepository<Financiamento, String> {
    List<Financiamento> findAll();
}
