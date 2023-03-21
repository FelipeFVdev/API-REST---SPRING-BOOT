package com.algaworks.algalog.domain.model.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.algalog.api.model.Ocorrencia;
import com.algaworks.algalog.domain.exception.NegocioException;
import com.algaworks.algalog.domain.model.Entrega;
import com.algaworks.algalog.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RegistroOcorrenciaService {
	
	private BuscaEntregaService buscarEntregaService;

	@Transactional
	public Ocorrencia registrar(Long entregaId, String descricao) {
		
		Entrega entrega = buscarEntregaService.buscar(entregaId);
		
		return entrega.adicionarOcorrencia(descricao);
		
	}
	
}
