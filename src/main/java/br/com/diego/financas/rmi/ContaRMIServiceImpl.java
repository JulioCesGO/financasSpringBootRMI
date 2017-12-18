package br.com.diego.financas.rmi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.diego.financas.modelo.Conta;
import br.com.diego.financas.repository.ContaRepository;
import br.com.diego.financas.service.IContaService;

@Service
public class ContaRMIServiceImpl implements ContaRMIService {

	@Autowired
	private ContaRepository contaRepository;
	
	@Override
	public List<Conta> getAllContas() {
		return contaRepository.findAll();
	}

}
