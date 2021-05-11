package com.curso.odoo.estadopago.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.odoo.estadopago.model.EstadoPago;
import com.curso.odoo.estadopago.repo.EstadoPagoRepo;
import com.curso.odoo.estadopago.service.EstadoPagoService;

@Controller
public class EstadoPagoController {

	@Autowired
	private EstadoPagoService estadoPagoService;

	@GetMapping("/EstadoPago")
	public String estadopago(Model model) {

		return "ProyectoS/EstadoPago";
	}

	@PostMapping("/EstadoPago")
	public String estadopagoPost(@RequestParam("codigoestadopago") Integer codigoestadopago,
			@RequestParam("nombreestadopago") String nombreestadopago) {

		EstadoPago estadopago_1 = new EstadoPago();

		estadopago_1.setCodigoestadopago(codigoestadopago);
		estadopago_1.setNombreestadopago(nombreestadopago);

		estadoPagoService.save(estadopago_1);

		return "ProyectoS/EstadoPago";
	}

}
