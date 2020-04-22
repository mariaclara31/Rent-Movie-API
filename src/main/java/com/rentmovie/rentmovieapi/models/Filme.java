package com.rentmovie.rentmovieapi.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Filme")
public class Filme implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FILME")
    private Long idFilme;

    @NotBlank(message = "É necessário informar o campo titulo!")
    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "DIRETOR")
    private String diretor;
    
    @Column(name = "GENERO")
    private String genero;
    
    @Column(name = "QUANTIDADE")
    private String quantidade;

}