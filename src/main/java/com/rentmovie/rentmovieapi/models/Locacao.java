package com.rentmovie.rentmovieapi.models;

import java.io.Serializable;
import java.util.Date;
import lombok.*;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Locacao")
public class Locacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigoLocacao;
	@OneToOne
	@JoinColumn(name="codigoCPF")
	private Cliente cliente;
	@ManyToMany
	@JoinTable(name="locacao_filme", joinColumns={@JoinColumn(name="codigoLocacao", referencedColumnName="codigoLocacao") }, inverseJoinColumns={@JoinColumn(name="codigoFilme", referencedColumnName="codigoFilme") } )
	private Filme filmes;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_emprestimo")
	private Date dataEmprestimo;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_devolucao")
	private Date dataDevolucao;
        @Column(name="data_renovacao")
        @Temporal(TemporalType.DATE)
        private Date dataRenovacao;
        
public Locacao() {}

    /**
     *
     * @param cliente
     * @param filmes
     * @param dataEmprestimo
     * @param dataDevolucao
     */
    public Locacao(Cliente cliente, Filme filmes,
			Date dataEmprestimo, Date dataDevolucao) {
		this.cliente = cliente;
		this.filmes = filmes;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
	}



	public int getCodigoLocacao() {
		return codigoLocacao;
	}

	public void setCodigoLocacao(int codigoLocacao) {
		this.codigoLocacao = codigoLocacao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Filme getFilmes() {
		return filmes;
	}

    /**
     *
     * @param filmes
     */
    public void setFilmes(Filme filmes) {
		this.filmes = filmes;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
        public Date getDataRenovacao() {
		return dataRenovacao;
	}

	public void setDataRenovacao(Date dataRenovacao) {
		this.dataRenovacao = dataRenovacao;
	}


}