package com.curso.odoo.etc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.odoo.actividades.model.Activity;
import com.curso.odoo.actividades.repo.ActivityRepo;

public class FacturasController {

	@Controller
	public class ActividadesController {
		@Autowired
		private ActivityRepo actividadRepo;
		
		@GetMapping("/Actividades")
		public String actividad() {
			
			return "ProyectoS/Actividades";
		}
		
		@PostMapping("/Actividades")
		public String actividadPost(@RequestParam("codigoactividad") int codigoactividad,
							  @RequestParam("nombreactividad") String nombreactividad) {
			
			
			Activity activity_1 = new Activity();
			
			activity_1.setCodigoactividad(codigoactividad);
			activity_1.setNombreactividad(nombreactividad);
			
			actividadRepo.save(activity_1);
			
			return "ProyectoS/Actividades";
		}

}
}
