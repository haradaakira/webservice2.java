package com.unesa.integrador.repository;

import com.unesa.integrador.model.Financeira;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FinanceiraRepository extends JpaRepository<Financeira, String> {
    List<Financeira> findAll();
}
