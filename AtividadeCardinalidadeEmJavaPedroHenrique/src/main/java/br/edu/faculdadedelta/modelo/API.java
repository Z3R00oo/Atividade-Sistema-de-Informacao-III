package br.edu.faculdadedelta.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class API {
	
	private String idEmpresa;
	private String periodo;
	private Object arquivo;
	
	@OneToOne
	private List<String> dadosBanco; //(Pode vir direto do banco ou de uma classe auxiliar)
	
	@OneToOne
	private Cliente cliente;

	public List<String> getDadosBanco() {
		return dadosBanco;
	}

	public void setDadosBanco(List<String> dadosBanco) {
		this.dadosBanco = dadosBanco;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Object getArquivo() {
		return arquivo;
	}

	public void setArquivo(Object arquivo) {
		this.arquivo = arquivo;
	}
	
	public List<String> leituraDoArquivo(Object arquivo)
	{
		List<String> dados = new ArrayList<String>();
		
		//codigo
		
		return dados;
	}

	public List<String> SomaMensCoPart(String valorMensalidade, String valorCoPart) 
	{
		List<String> valoresSomados = new ArrayList<String>();
		
		//codigo
		
		return valoresSomados;
	}

	public String GeraRelatorioDivergencias(String idEmpresa, String periodo) 
	{
		return "Caminho do Arquivo";
	}
}
