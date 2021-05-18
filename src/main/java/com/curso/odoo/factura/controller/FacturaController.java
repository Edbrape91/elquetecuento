package com.curso.odoo.factura.controller;

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
import com.curso.odoo.estado.model.Estado;
import com.curso.odoo.estado.service.EstadoService;
import com.curso.odoo.estadopago.model.EstadoPago;
import com.curso.odoo.estadopago.service.EstadoPagoService;
import com.curso.odoo.factura.model.Factura;
import com.curso.odoo.factura.service.FacturaService;

@Controller
public class FacturaController {

	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private FacturaService facturaService;
	
	@Autowired
	private ActivityService actividadService;
	
	@Autowired
	private EstadoService estadoService;
	
	@Autowired
	private EstadoPagoService estadopagoService;

	@GetMapping("/facturas")
	public String facturaList(Model model) {
		
		//Pedir a la base de datos las actividades
		List <Factura> facturas = facturaService.find(); 
		
		//Pasarselas a la web(a traves del modelo)
		model.addAttribute("Facturas", facturas);

		return "ProyectoS/facturas";
	}

	@GetMapping("/factura")
	public String facturaForm(Model model)	{
		
		List <Cliente> clientes = clienteService.find(); 
		List <Activity> actividad = actividadService.find(); 
		List <Estado> estado = estadoService.find();
		List <EstadoPago> estadopago = estadopagoService.find();
		
		model.addAttribute("actividades", actividad);
		model.addAttribute("clientes", clientes);	
		model.addAttribute("estados", estado);
		model.addAttribute("estadopagos", estadopago);
		
		return "ProyectoS/FormFacturas";
	}

	@PostMapping("/factura")
	public String FacturaPost(@RequestParam ("codClient") Integer codCliente,
			@RequestParam ("codActi") Integer codActividad,
			@RequestParam ("codigoEstado") Integer codEstado,
			@RequestParam ("fechaFactura") Date fechaFactura,
			@RequestParam ("venceFactura") Date vencimientoFactura,
			@RequestParam ("impuestos") Double impuestos,
			@RequestParam ("total") Double total,
			@RequestParam ("codEstadoPago") Integer codEstadoPago) {
		
		
Factura factura_1 = new Factura();
		
		//buscar cliente
         Cliente c1= clienteService.findId(codCliente);
         
         Activity a1= actividadService.findId(codActividad);
         
         Estado e1= estadoService.findId(codEstado);
         
         EstadoPago ep1= estadopagoService.findId(codEstadoPago);

        

		factura_1.setCliente(c1);
		factura_1.setActividad(a1);
		factura_1.setEstado(e1);
		factura_1.setFechafactura(fechaFactura);
		factura_1.setFechavencimiento(vencimientoFactura);
		factura_1.setImpuestos(impuestos);
		factura_1.setTotal(total);
		factura_1.setEstadopago(ep1);
		
		facturaService.save(factura_1);
		
		return "redirect:/facturas";
	}

	@GetMapping("/factura_borrar")
	public String facturaBorra(@RequestParam Integer idFactura, Model model) {
		
		facturaService.delete(idFactura);
		
		return "redirect:/facturas";
	}
	
	@PostMapping("/buscarfactura")
	public String clienteFind(@RequestParam ("Id") Integer Id, Model model){
		
		Optional<Factura> facturas = facturaService.findId(Id);
		
		model.addAttribute("Facturas", facturas.get());
		
		return "ProyectoS/facturas";
	}
	
	@GetMapping("/factura_editar")
	public String facturaEdit(@RequestParam Integer idFactura, Model model) {
		
		List <Cliente> clientes = clienteService.find(); 
		List <Activity> actividad = actividadService.find(); 
		List <Estado> estado = estadoService.find();
		List <EstadoPago> estadopago = estadopagoService.find();
		
		model.addAttribute("actividades", actividad);
		model.addAttribute("clientes", clientes);	
		model.addAttribute("estados", estado);
		model.addAttribute("estadopagos", estadopago);
		
		
		Optional<Factura> facturas = facturaService.findId(idFactura);
		
		model.addAttribute("Facturas", facturas.get());
		
		return "ProyectoS/facturaupdate";
	}
	
	
}
