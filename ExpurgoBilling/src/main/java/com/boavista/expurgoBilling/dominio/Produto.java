package com.boavista.expurgoBilling.dominio;


import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Produto {
	
	private static final Logger logger = LoggerFactory.getLogger(Produto.class);
	
	private String sistema;
	private String assunto;
	private String descricao;
	private int quantidade;
	private Date data_prodt;
	
	
	public String getSistema() {
		return sistema;
	}
	public void setSistema(String sistema) {
		this.sistema = sistema;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Date getData_prodt() {
		return data_prodt;
	}
	public void setData_prodt(Date data_prodt) {
		this.data_prodt = data_prodt;
	}
	
	}


