package com.curso.odoo.controller.Actividades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	public String actividad() {
		
		return "ProyectoS/Actividades";
	}
	
	@PostMapping("/Actividades")
	public String actividadPost(@RequestParam("codigoactividad") int codigoactividad,
						  @RequestParam("nombreactividad") String nombreactividad) {
		
		
		Activity activity_1 = new Activity();
		
		activity_1.setcodigoactividad(codigoactividad);
		activity_1.setnombreactividad(nombreactividad);
		
		actividadRepo.save(activity_1);
		
		return "ProyectoS/Actividades";
	}

}