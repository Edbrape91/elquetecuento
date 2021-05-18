package com.curso.odoo.factura.repo;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.curso.odoo.factura.model.Factura;

@Repository
public interface FacturaRepo extends JpaRepository<Factura, Integer>{
	
//	@Modifying
//	@Query ("update factura set codigocliente = :codigo, codigoactividad = :actividad, codigoestado = :estado, fechafactura = :fechaFact, fechavencimiento = :fechaVenci, impuestos = :impuesto, total = :total, codigoestadopago = :estadoPago Where codigofactura = :codfactura")
//	void updatefactura (@Param ("codigo")int codigo, @Param ("actividad")int actividad, @Param ("estado") int estado, @Param ("fechaFact") Date fechaFact, @Param ("impuesto") Double impuesto, @Param ("total") Double total, @Param ("estadoPago") int estadoPago, @Param ("codfactura") int codfactura);	

}
