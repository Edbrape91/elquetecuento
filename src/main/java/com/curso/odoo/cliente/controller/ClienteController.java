package com.curso.odoo.cliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.odoo.cliente.model.Cliente;
import com.curso.odoo.cliente.repo.ClienteRepo;
import com.curso.odoo.cliente.service.ClienteService;

@Controller
public class ClienteController {

	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/cliente")
	public String cliente(Model model) {
		
		
		return null;
	}
	
	@PostMapping("/cliente")
	public String clientePost(@RequestParam ("clientId") int clientId, @RequestParam ("nameOf") String nameOf) {
		
              Cliente cl1=new Cliente();
              cl1.setId(clientId);
              cl1.setNombre(nameOf);
              
              
              
              
              
              
              
		
		
		return null;
	}
	
}
