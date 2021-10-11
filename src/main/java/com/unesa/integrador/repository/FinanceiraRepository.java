package com.unesa.integrador.repository;

import com.unesa.integrador.model.Financeira;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FinanceiraRepository extends JpaRepository<Financeira, String> {
    List<Financeira> findAll();

    @Query(value = "SELECT * FROM FINANCEIRA WHERE CNPJ = :cnpj", nativeQuery = true)
    public Financeira findByCNPJ(@Param("cnpj") String cnpj);

    @Query(value = "SELECT coalesce(max(id),0) FROM Financeira")
    public int getMaxId();
}
