package com.curso.odoo.etc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping(value="/informes")
public class OtroController {
	
	@GetMapping("/listado/{codigoProvincia}")
	public String listadoPrincipal(@PathVariable("codigoProvincia")int codigoProvincia, Model modelo)
	{
		modelo.addAttribute("codigoProvincia", codigoProvincia);
		return "informes/listadoprincipal";
	}

}

