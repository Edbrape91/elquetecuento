package com.curso.odoo.factura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.curso.odoo.factura.model.Factura;
import com.curso.odoo.factura.repo.FacturaRepo;
import com.curso.odoo.factura.service.FacturaService;

@Controller
public class FacturaController {

	@Autowired
	private FacturaService facturaService;

	@GetMapping("/Factura")
	public String Factura(Model model) {
		
		
		return null;
	}
	
	@PostMapping("/Factura")
	public String FacturaPost() {
		
		
		return null;
	}

	
	
}
