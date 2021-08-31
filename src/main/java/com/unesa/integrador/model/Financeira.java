package com.unesa.integrador.model;

import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "financeira")
@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Financeira {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Nullable
    private String cnpj;
    @Nullable
    private String numerobanco;
    @Nullable
    private String numeroagencia;
    @Nullable
    private String numeroconta;
    @Nullable
    private String telefone;
    @Nullable
    private String email;
    @Nullable
    private String senha;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;
}
