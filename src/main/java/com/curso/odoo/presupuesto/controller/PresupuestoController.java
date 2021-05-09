package com.curso.odoo.presupuesto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.curso.odoo.presupuesto.model.Presupuesto;
import com.curso.odoo.presupuesto.repo.PresupuestoRepo;
import com.curso.odoo.presupuesto.service.PresupuestoService;

@Controller
public class PresupuestoController {

	
	@Autowired
	private PresupuestoService presupuestoService;
	
	@GetMapping("/presupuesto")
	public String presupuesto(Model model) {
		
		
		return null;
	}
	
	@PostMapping("/presupuesto")
	public String presupuestoPost() {
		
		
		
		return null;
	}
	
}
