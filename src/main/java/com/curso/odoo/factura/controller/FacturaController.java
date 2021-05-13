package com.curso.odoo.factura.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.odoo.actividades.model.Activity;
import com.curso.odoo.factura.model.Factura;
import com.curso.odoo.factura.repo.FacturaRepo;
import com.curso.odoo.factura.service.FacturaService;

@Controller
public class FacturaController {

	@Autowired
	private FacturaService facturaService;

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
		
		
		factura_1.setCodigocliente(codCliente);
		factura_1.setCodigoactividad(codActividad);
		factura_1.setCodigoestado(codEstado);
		factura_1.setFechafactura(fechaFactura);
		factura_1.setFechavencimiento(vencimientoFactura);
		factura_1.setImpuestos(impuestos);
		factura_1.setTotal(total);
		factura_1.setCodigoestadopago(codEstadoPago);
		
		facturaService.save(factura_1);
		
		return "redirect:/factura";
	}

	
	
}
