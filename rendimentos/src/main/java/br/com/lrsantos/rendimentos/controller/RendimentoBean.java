package br.com.lrsantos.rendimentos.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.lrsantos.rendimentos.bean.Beneficiario;

@ManagedBean
public class RendimentoBean {

	private Beneficiario beneficiario;
	
	@PostConstruct
	private void init() {
		this.beneficiario = new Beneficiario();
	}
	
	
	public void consulta() {
		System.out.println("Consulta "+ this.beneficiario);
		this.beneficiario = new Beneficiario();
	}
	
	public void limpa() {
		this.beneficiario = new Beneficiario();
	}

	public Beneficiario getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(Beneficiario beneficiario) {
		this.beneficiario = beneficiario;
	}
	
	
}
