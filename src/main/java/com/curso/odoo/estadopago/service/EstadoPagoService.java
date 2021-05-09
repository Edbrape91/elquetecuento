package com.curso.odoo.estadopago.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.odoo.estadopago.repo.EstadoPagoRepo;

@Service
public class EstadoPagoService {
	
	@Autowired
	private EstadoPagoRepo estadoPagoRepo;

}
