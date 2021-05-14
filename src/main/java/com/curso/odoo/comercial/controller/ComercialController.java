package com.curso.odoo.comercial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.odoo.comercial.model.Comercial;
import com.curso.odoo.comercial.service.ComercialService;

@Controller
public class ComercialController {

	@Autowired
	private ComercialService comercialService;

	@GetMapping("/comerciales")
	public String comercialList(Model model) {
		//Pedir a la base de datos los clientes
		List<Comercial> comercial = comercialService.find(); 
	
		//Pasarselas a la web(a traves del modelo)
		model.addAttribute("comerciales", comercial);
		
		return "ProyectoS/comerciales";
	}
	
	@GetMapping("/comercial")
	public String comercialForm(Model model) {
		
		
		return "ProyectoS/Comercial";
		
	}

	@PostMapping("/comercial")
	public String comercialPost(@RequestParam("codigocomercial") Integer codigocomercial,
			  @RequestParam("nombrecomercial") String nombrecomercial, 
			  @RequestParam("apellidoscomercial") String apellidoscomercial) {

		Comercial comercial_1 = new Comercial();

		comercial_1.setCodigocomercial(codigocomercial);
		comercial_1.setNombrecomercial(nombrecomercial);
		comercial_1.setApellidoscomercial(apellidoscomercial);
		
		comercialService.save(comercial_1);

		return "redirect:/comercial";
	}

	@GetMapping("/comercial_borrar")
	public String comercialBorra(@RequestParam Integer idComercial, Model model) {
		
		comercialService.delete(idComercial);
		
		return "redirect:/comerciales";
	}
	
	
	
}
