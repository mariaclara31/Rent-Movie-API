package com.rentmovie.rentmovieapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private long idUsuario;

    @NotBlank(message = "É necessário informar o campo nomeCompleto")
    @Column(name = "NOME_COMPLETO", unique = true)
    private String nomeCompleto;

    @NotBlank(message = "É necessário informar o campo cpf")
    @Column(name = "CPF")
    private String cpf;

    @NotBlank(message = "É necessário informar o campo data de aniversário")
    @Column(name = "DATA_ANIVERSARIO")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String dataAniversario;

    @NotBlank(message = "É necessário informar o campo sexo")
    @Column(name = "SEXO")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String sexo;

    public Cliente(String josé_da_Silva) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    