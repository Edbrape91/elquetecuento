package com.curso.odoo.factura.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.odoo.factura.repo.FacturaRepo;

@Service
public class FacturaService {

	@Autowired
	private FacturaRepo facturaRepo;
	
}
