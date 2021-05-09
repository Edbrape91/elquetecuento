package com.curso.odoo.estado.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.curso.odoo.estado.model.Estado;
import com.curso.odoo.estado.repo.EstadoRepo;



@Controller
public class EstadoController {
	
	@Autowired
	private EstadoRepo EstadoRepo;
	
	@GetMapping("/estado")
	public String estado(Model model) {
		
		
		return null;
	}
	
	@PostMapping("/estado")
	public String estadoPost() {
		
		
		
		return null;
	}
	
}
