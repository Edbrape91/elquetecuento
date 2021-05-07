package com.curso.odoo.controller.Actividades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.odoo.model.Actividades.Activity;
import com.curso.odoo.repositorios.Actividades.ActividadRepo;


@Controller
public class ActividadesController {
	@Autowired
	private ActividadRepo actividadRepo;
	
	@GetMapping("/Actividades")
	public String actividad(Model model) {
		
		//Pedir a la base de datos las actividades
		List <Activity> actividades = actividadRepo.findAll(); 
	
		//Pasarselas a la web(a traves del modelo)
		model.addAttribute("Actividades", actividades);
		return "ProyectoS/Actividades";
	}
	
	@PostMapping("/Actividades")
	public String actividadPost(@RequestParam("codigoactividad") Integer codigoactividad,
						  @RequestParam("nombreactividad") String nombreactividad) {
		
		
		Activity activity_1 = new Activity();
		
		activity_1.setCodigoactividad(codigoactividad);
		activity_1.setNombreactividad(nombreactividad);
		
		actividadRepo.save(activity_1);
		
		return "redirect:/Actividades";
	}

}
