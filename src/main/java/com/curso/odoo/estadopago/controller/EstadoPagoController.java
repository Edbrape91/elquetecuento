package com.curso.odoo.estadopago.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.curso.odoo.estadopago.model.EstadoPago;
import com.curso.odoo.estadopago.repo.EstadoPagoRepo;
import com.curso.odoo.estadopago.service.EstadoPagoService;

@Controller
public class EstadoPagoController {

	
	@Autowired
	private EstadoPagoService estadoPagoService;
	
	@GetMapping("/estadopago")
	public String estadopago(Model model) {
		
		
		return null;
	}
	
	@PostMapping("/estadopago")
	public String estadopagoPost() {
		
		
		
		return null;
	}
	
	
}
