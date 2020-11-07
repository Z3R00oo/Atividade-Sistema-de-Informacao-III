package br.edu.faculdadedelta.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class ExtracaoDoBD {
	
	private String query = "Query de Consulta no Banco";
	
	@OneToMany
	private API apiRelatorio;
	
	//No Diagrama eu acho que coloquei errado, acho que assim ficou melhor (um para um)
	@OneToOne
	private ClasseComDadosDoBanco classeAux;

	public API getApiRelatorio() {
		return apiRelatorio;
	}

	public void setApiRelatorio(API apiRelatorio) {
		this.apiRelatorio = apiRelatorio;
	}
	
	public void tratamentoDaQuery(String query, String idEmpresa) 
	{
		//codigo
	}

	public List<String> selectDados(String query, String idEmpresa)
	{
		List<String> dados = new ArrayList<String>();
		classeAux = new ClasseComDadosDoBanco(dados);
		
		return dados;
	}
}
