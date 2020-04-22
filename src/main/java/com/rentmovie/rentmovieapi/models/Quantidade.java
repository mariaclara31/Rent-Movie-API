/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentmovie.rentmovieapi.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Quantidade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigoQuantidade;
	private final String nome;
	@OneToOne
	@JoinColumn(name="codigoFilme")
	private final Filme filme;
	@OneToOne
	@JoinColumn(name="codigoPessoa")

	private final int quantidade;

	public Quantidade(String nome, Filme filme, int quantidade) {
		this.nome = nome;
		this.filme = filme;
		this.quantidade = quantidade;
	} 
}
