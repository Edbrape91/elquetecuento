package com.curso.odoo.comercial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.curso.odoo.comercial.model.Comercial;
import com.curso.odoo.comercial.repo.ComercialRepo;


@Controller
public class ComercialController {

	
	@Autowired
	private ComercialRepo ComercialRepo;
	
	@GetMapping("/comercial")
	public String comercial(Model model) {
		
		
		return null;
	}
	
	@PostMapping("/comercial")
	public String comercialPost() {
		
		
		
		return null;
	}
	
}
