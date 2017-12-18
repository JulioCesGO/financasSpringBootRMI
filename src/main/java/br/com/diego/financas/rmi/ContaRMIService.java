package br.com.diego.financas.rmi;

import java.util.List;

import br.com.diego.financas.modelo.Conta;

public interface ContaRMIService {

	public List<Conta> getAllContas();
	
}
