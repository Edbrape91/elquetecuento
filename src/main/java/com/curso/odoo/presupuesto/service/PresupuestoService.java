package com.curso.odoo.presupuesto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.odoo.presupuesto.repo.PresupuestoRepo;

@Service
public class PresupuestoService {

	@Autowired
	private PresupuestoRepo presupuestoRepo;
	
}
