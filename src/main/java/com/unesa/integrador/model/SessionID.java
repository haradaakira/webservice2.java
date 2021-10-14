package com.unesa.integrador.model;

import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "sessionid")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SessionID {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Nullable
    private String sessionId;

}
