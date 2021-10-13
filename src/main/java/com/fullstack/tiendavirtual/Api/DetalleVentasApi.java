package com.fullstack.tiendavirtual.Api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 
import com.fullstack.tiendavirtual.DAO.DetalleVentasDAO;
import com.fullstack.tiendavirtual.Model.DetalleVentas;


@RestController
@RequestMapping
public class DetalleVentasApi {
	
	@Autowired
	private DetalleVentasDAO detalleVentasDAO;
	@PostMapping("detalleVentas/guardar")
	public void guardar(@RequestBody DetalleVentas detalleVentas) {
		detalleVentasDAO.save(detalleVentas);
	}
	
	@GetMapping("detalleVentas/listar")
	public List<DetalleVentas> listar(){
		return detalleVentasDAO.findAll();
	}
	
	@DeleteMapping("detalleVentas/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		detalleVentasDAO.deleteById(id);
	}
	
	@PutMapping("detalleVentas/actualizar")
	public void actualizar(@RequestBody DetalleVentas detalleVentas) {
		detalleVentasDAO.save(detalleVentas);
	}

}
