package com.curso.odoo.cliente.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.odoo.cliente.repo.ClienteRepo;

@Service
public class ClienteService {

	
	@Autowired
	private ClienteRepo clienteRepo;
	
}
