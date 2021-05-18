package com.curso.odoo.presupuesto.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.odoo.actividades.model.Activity;
import com.curso.odoo.actividades.service.ActivityService;
import com.curso.odoo.cliente.model.Cliente;
import com.curso.odoo.cliente.service.ClienteService;
import com.curso.odoo.comercial.model.Comercial;
import com.curso.odoo.comercial.service.ComercialService;
import com.curso.odoo.estado.model.Estado;
import com.curso.odoo.estado.service.EstadoService;
import com.curso.odoo.presupuesto.model.Presupuesto;
import com.curso.odoo.presupuesto.service.PresupuestoService;

@Controller
public class PresupuestoController {

	
	@Autowired
	private PresupuestoService presupuestoService;
	
	@Autowired
	private ActivityService activityService;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private ComercialService comercialService;
	
	@Autowired
	private EstadoService estadoService;
	
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
		
		List<Activity> actividad = activityService.find();
		List<Cliente> cliente = clienteService.find();
		List<Comercial> comercial = comercialService.find();
		List<Estado> estado = estadoService.find();
		
		
		model.addAttribute("actividades", actividad);
		model.addAttribute("clientes", cliente);
		model.addAttribute("comerciales", comercial);
		model.addAttribute("estados", estado);
		
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
		
		 Cliente c1 = clienteService.findId(codigocliente);
		
        
         Activity a1 = activityService.findId(codigoactividad);
         
         Estado e1= estadoService.findId(codigoestado);
         
         Comercial com1= comercialService.findId(codigocomercial);
		        
         
		
		presupuesto_1.setTotal(total);
		presupuesto_1.setCliente(c1);
		presupuesto_1.setComercial(com1);
		presupuesto_1.setActividad(a1);
		presupuesto_1.setEstado(e1);
		
		
		presupuestoService.save(presupuesto_1);

		return "redirect:/presupuesto";
	}
	
	@GetMapping("/presupuesto_borrar")
	public String presupuestoBorra(@RequestParam Integer idPresupuesto, Model model) {
		
		presupuestoService.delete(idPresupuesto);
		
		return "redirect:/presupuestos";
	}
	
	@PostMapping("/buscarpresupuesto")
	public String presupuestoFind(@RequestParam ("Id") Integer Id, Model model){
		
		Optional<Presupuesto> presupuesto = presupuestoService.findId(Id);
		
		model.addAttribute("presupuestos", presupuesto.get());
		
		return "ProyectoS/presupuestos";
	}
}
