package com.unesa.integrador.model;

import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "endereco")
@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Endereco {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Nullable
    private String cep;
    @Nullable
    private String logradouro;
    @Nullable
    private String numero;
    @Nullable
    private String complemento;
    @Nullable
    private String bairro;
    @Nullable
    private String cidade;
    @Nullable
    private String estado;
}
