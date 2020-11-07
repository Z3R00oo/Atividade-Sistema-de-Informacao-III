package br.edu.faculdadedelta.modelo;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Cliente {
	
	private String nomeFantasia;
	private String cpng;
	private String cep;
	
	@OneToMany
	private API apiRelatorio;
	
	
	public API getApiRelatorio() {
		return apiRelatorio;
	}
	public void setApiRelatorio(API apiRelatorio) {
		this.apiRelatorio = apiRelatorio;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getCpng() {
		return cpng;
	}
	public void setCpng(String cpng) {
		this.cpng = cpng;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String efetuaRequisicao(String idEmpresa, String periodo, Object arquivo) 
	{
		//Codigo
		return "Resultado da Requisicao";
	}
}
