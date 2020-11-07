package br.edu.faculdadedelta.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class ClasseComDadosDoBanco {
	
	private String nomeFuncionario;
	private String dtNascimentoFuncionario;
	private String cpf;
	private String valorMensalidade;
	
	@OneToOne
	private ExtracaoDoBD dadosDoBanco;
	
	@OneToMany
	private API apiRequisicao;
	
	ClasseComDadosDoBanco(List<String> dados) 
	{
		dadosDoBanco = (ExtracaoDoBD) dados;
	}
	
	public API getApiRequisicao() {
		return apiRequisicao;
	}

	public void setApiRequisicao(API apiRequisicao) {
		this.apiRequisicao = apiRequisicao;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public String getDtNascimentoFuncionario() {
		return dtNascimentoFuncionario;
	}
	public void setDtNascimentoFuncionario(String dtNascimentoFuncionario) {
		this.dtNascimentoFuncionario = dtNascimentoFuncionario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getValorMensalidade() {
		return valorMensalidade;
	}
	public void setValorMensalidade(String valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}
	
	
}
