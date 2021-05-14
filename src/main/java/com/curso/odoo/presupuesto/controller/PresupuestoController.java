package com.curso.odoo.presupuesto.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.odoo.presupuesto.model.Presupuesto;
import com.curso.odoo.presupuesto.repo.PresupuestoRepo;
import com.curso.odoo.presupuesto.service.PresupuestoService;

@Controller
public class PresupuestoController {

	
	@Autowired
	private PresupuestoService presupuestoService;
	
	@GetMapping("/presupuestos")
	public String presupuestosList(Model model) {
		//Pedir a la base de datos los clientes
		List<Presupuesto> presupuesto = presupuestoService.find(); 
	
		//Pasarselas a la web(a traves del modelo)
		model.addAttribute("presupuestos", presupuesto);
		
		return "ProyectoS/presupuestos";
	
	}
	
	
	@GetMapping("/presupuesto")
	public String presupuestoForm(Model model) {
		
		
		return "ProyectoS/presupuesto";
	}

	
	@PostMapping("/presupuesto")
	public String presupuestoPost(@RequestParam("fechaPresupuesto") Date fechaPresupuesto,
			  @RequestParam("total") Double total, 
			  @RequestParam("codigocliente") Integer codigocliente,
			  @RequestParam("codigocomercial") Integer codigocomercial,
			  @RequestParam("codigoactividad") Integer codigoactividad,
			  @RequestParam("codigoestado") Integer codigoestado) {

		Presupuesto presupuesto_1 = new Presupuesto();

		
		presupuesto_1.setFechapresupuesto(fechaPresupuesto);
		/*try {
			presupuesto_1.setFechapresupuesto(new SimpleDateFormat("dd/mm/yyyy").parse(fechaPresupuesto));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		presupuesto_1.setTotal(total);
		presupuesto_1.setCodigocliente(codigocliente);
		presupuesto_1.setCodigocomercial(codigocomercial);
		presupuesto_1.setCodigoactividad(codigoactividad);
		presupuesto_1.setCodigoestado(codigoestado);
		
		
		presupuestoService.save(presupuesto_1);

		return "redirect:/presupuesto";
	}
	
	@GetMapping("/presupuesto_borrar")
	public String presupuestoBorra(@RequestParam Integer idPresupuesto, Model model) {
		
		presupuestoService.delete(idPresupuesto);
		
		return "redirect:/presupuestos";
	}
	
}
