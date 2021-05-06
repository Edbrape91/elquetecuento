package com.curso.odoo.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//Clase Java que guardara los datos en la tabbla Prueba de MariaDB
@Entity
@Table (name="testjpa")


public class Elquetecuento {
	@Id
	private int c1;
	private String c2;
	public int getC1() {
		return c1;
	}
	public void setC1(int c1) {
		this.c1 = c1;
	}
	public String getC2() {
		return c2;
	}
	public void setC2(String c2) {
		this.c2 = c2;
	}
}
