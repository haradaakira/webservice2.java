package com.unesa.integrador.repository;

import com.unesa.integrador.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {
    List<Endereco> findAll();
}
