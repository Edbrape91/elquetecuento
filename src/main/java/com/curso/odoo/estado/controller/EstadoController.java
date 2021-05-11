package com.curso.odoo.estado.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.odoo.estado.model.Estado;
import com.curso.odoo.estado.repo.EstadoRepo;
import com.curso.odoo.estado.service.EstadoService;



@Controller
public class EstadoController {
	
	@Autowired
	private EstadoService estadoService;
	
	@GetMapping("/Estado")
	public String estado(Model model) {
		
		
		return "ProyectoS/Estado";
	}
	
	@PostMapping("/Estado")
	public String estadoPost(@RequestParam("codigoestado") Integer codigoestado,
			@RequestParam("nombreestado") String nombreestado) {

		Estado estado_1 = new Estado();

		estado_1.setCodigoestado(codigoestado);
		estado_1.setNombreestado(nombreestado);

		estadoService.save(estado_1); 
		
		
		
		return "ProyectoS/Estado";
	}
	
}
