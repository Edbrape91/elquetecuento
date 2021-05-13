package com.curso.odoo.etc.controllers;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.odoo.etc.modelos.Venta;

@Controller
public class HomeController {

	@GetMapping("/")
	public String inicio() {
		return "ProyectoS/login";
	}

	@GetMapping("/ajustes")
	public String ajustes() {

		return "ProyectoS/ajustes";
	}

	@GetMapping("/aplicaciones")
	public String aplicaciones() {

		return "ProyectoS/aplicaciones";
	}

		
	@GetMapping("/conversaciones")
	public String conversaciones() {

		return "ProyectoS/conversaciones";
	}

	
	@GetMapping("/login")
	public String login() {

		return "ProyectoS/login";
	}

	@GetMapping("/registro")
	public String registro() {

		return "ProyectoS/registro";
	}

	@GetMapping("/ventas_clientes")
	public String ventas_clientes() {

		return "ProyectoS/ventas_clientes";
	}

	@GetMapping("/ventas")
	public String ventas(Model modelo) {
		List<Venta> venta = new LinkedList<Venta>();

		Venta venta_1 = new Venta();

		venta_1.setCodigoPresupuesto(1);
		venta_1.setFechaPresupuesto("Valencia");
		venta_1.setCodigoCliente(1);
		venta_1.setCodigoComercial(1);
		venta_1.setActividad("Swipping");
		venta_1.setCodigoEstado(1);
		venta_1.setTotal(1);
		venta.add(venta_1);

		venta_1 = new Venta();

		venta_1.setCodigoPresupuesto(1);
		venta_1.setFechaPresupuesto("12/3/21");
		venta_1.setCodigoCliente(1);
		venta_1.setCodigoComercial(1);
		venta_1.setActividad("Petting");
		venta_1.setCodigoEstado(1);
		venta_1.setTotal(1);
		venta.add(venta_1);

		venta_1 = new Venta();

		venta_1.setCodigoPresupuesto(1);
		venta_1.setFechaPresupuesto("Valencia");
		venta_1.setCodigoCliente(1);
		venta_1.setCodigoComercial(1);
		venta_1.setActividad("Yoga");
		venta_1.setCodigoEstado(1);
		venta_1.setTotal(1);
		venta.add(venta_1);

		venta_1 = new Venta();

		venta_1.setCodigoPresupuesto(1);
		venta_1.setFechaPresupuesto("Valencia");
		venta_1.setCodigoCliente(1);
		venta_1.setCodigoComercial(1);
		venta_1.setActividad("Eat");
		venta_1.setCodigoEstado(1);
		venta_1.setTotal(1);
		venta.add(venta_1);

		venta_1 = new Venta();

		modelo.addAttribute("ventas", venta);

		return "ProyectoS/ventas";
	}

	@GetMapping("/index")
	public String index() {

		return "ProyectoS/index";
	}

	
	// 1. Mapeo
	// RECEPTOR DEL FORMULARIO DE LOGIN
	@PostMapping("/login")
	public String login(@RequestParam String userInput, @RequestParam String passwordInput, Model model) {
		System.out.println("RECEPTOR DEL FORMULARIO user:" + userInput + " password:" + passwordInput);

		// 2. lógica de negocio
		// basee de datos y comprobar que ese usuario y usa contraseña están dados de
		// alta en el sistema
		boolean loginOk = (userInput.equalsIgnoreCase("Evaristo") && passwordInput.equalsIgnoreCase("Evaristo1234")); // contactará
																														// con
																														// la
																														// bd
																														// en
																														// realidad

		// 3. preparación de la visual o devolución al navegador
		model.addAttribute("loginOk", loginOk);

		if (loginOk) {
			System.out.println("login ok");
			return "redirect:/ProyectoS/index?welcome=true";
		} else {
			System.out.println("login failed");
			return "ProyectoS/login";
		}
	}

	/*
	 * @GetMapping("/newClientForm") public String newClientForm() {
	 * 
	 * return "newClientForm"; }
	 */

	@PostMapping("/registro")
	public String register_form_catcher(@RequestParam String name, @RequestParam String lastName,
			@RequestParam String userName, @RequestParam String email, Model model) {

		if (email.contains("@")) {
			// redirigirlo al login
		} else {
			model.addAttribute("success", false);
		}

		return "ProyectoS/login";

	}

	
	
}
