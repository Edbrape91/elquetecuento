package com.curso.odoo.estado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.odoo.estado.repo.EstadoRepo;
import com.curso.odoo.estado.model.Estado;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepo estadoRepo;
	
	public List<Estado> find() {
		return estadoRepo.findAll();
	}

	public void save(Estado estado) {
		estadoRepo.save(estado);
	}
	
	
}
