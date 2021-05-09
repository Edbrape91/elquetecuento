package com.curso.odoo.pais.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.curso.odoo.pais.model.Pais;
import com.curso.odoo.pais.repo.PaisRepo;


@Controller
public class PaisController {

	@Autowired
	private PaisRepo PaisRepo;
	
	@GetMapping("/pais")
	public String pais(Model model) {
		
		
		return null;
	}
	
	@PostMapping("/pais")
	public String paisPost() {
		
		
		
		return null;
	}
	
}
