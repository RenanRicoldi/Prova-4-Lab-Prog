package br.uel.produtos;

import java.io.Serializable;
import java.util.Calendar;

//esta classe implementa o transfer object od design pattern DAO
public class Produto implements Serializable{
	
	private int id;
	
	private String nome;
	
	private int quantidade;
	
	private double preco;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	

}
