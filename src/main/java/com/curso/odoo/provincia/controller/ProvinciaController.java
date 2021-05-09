package com.curso.odoo.provincia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.curso.odoo.provincia.model.Provincia;
import com.curso.odoo.provincia.repo.ProvinciaRepo;

@Controller
public class ProvinciaController {

	
	@Autowired
	private ProvinciaRepo ProvinciaRepo;
	
	@GetMapping("/provincia")
	public String provincia(Model model) {
		
		
		return null;
	}
	
	@PostMapping("/provincia")
	public String provinciaPost() {
		
		
		
		return null;
	}
	
}
