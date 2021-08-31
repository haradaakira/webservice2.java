package com.unesa.integrador.model;

import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "pessoafisica")
@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class PessoaFisica {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Nullable
    private String cpf;
    @Nullable
    private String nome;
    @Nullable
    private String email;
    @Nullable
    private String telefone;
    @Nullable
    private String rendamensal;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "financiamento_id", referencedColumnName = "id")
    private Financiamento financiamento;

}
