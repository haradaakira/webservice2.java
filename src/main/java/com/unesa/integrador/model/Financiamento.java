package com.unesa.integrador.model;

import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "financiamento")
@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Financiamento {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Nullable
    private String valor;
    @Nullable
    private String parcela;
    @Nullable
    private String juros;
}
