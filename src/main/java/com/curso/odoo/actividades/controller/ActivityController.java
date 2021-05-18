package com.curso.odoo.actividades.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.odoo.actividades.model.Activity;
import com.curso.odoo.actividades.service.ActivityService;


@Controller
public class ActivityController {
	
	@Autowired
	private ActivityService activityService;
	
	

	@GetMapping("/actividades")
	public String actividadesList(Model model) {
		
		//Pedir a la base de datos las actividades
		List <Activity> actividades = activityService.find(); 
	
		//Pasarselas a la web(a traves del model)
		model.addAttribute("Actividades", actividades);
		return "ProyectoS/ActividadesListadas";
	}
	
	@GetMapping("/actividad")
	public String actividadForm(Model model){
	
		return "ProyectoS/Actividades";
	}
	
	@PostMapping("/actividad")
	public String actividadPost(@RequestParam("codigoactividad") Integer codigoactividad,
						  @RequestParam("nombreactividad") String nombreactividad) {
		
		
		Activity activity_1 = new Activity();
		
		activity_1.setCodigoactividad(codigoactividad);
		activity_1.setNombreactividad(nombreactividad);
		
		activityService.save(activity_1);
		
		return "redirect:/actividad";
	}

	@GetMapping("/actividad_borrar")
	public String actividadBorra(@RequestParam Integer idActivity, Model model) {
		
		activityService.delete(idActivity);
		
		return "redirect:/actividades";
	}
	

}
