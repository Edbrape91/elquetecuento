package com.curso.odoo.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.odoo.cliente.model.Cliente;
import com.curso.odoo.cliente.repo.ClienteRepo;

@Controller
public class ClienteController {

	
	@Autowired
	private ClienteRepo clienteRepo;
	
	@GetMapping("/cliente")
	public String cliente(Model model) {
		
		
		return null;
	}
	
	@PostMapping("/cliente")
	public String clientePost() {
		
		
		
		return null;
	}
	
}
