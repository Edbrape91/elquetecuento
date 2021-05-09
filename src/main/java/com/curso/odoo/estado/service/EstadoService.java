package com.curso.odoo.estado.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.odoo.estado.repo.EstadoRepo;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepo estadoRepo;
	
	
}
