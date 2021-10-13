package com.fullstack.tiendavirtual.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 
import com.fullstack.tiendavirtual.DAO.VentasDAO;
import com.fullstack.tiendavirtual.Model.Ventas;


@RestController
@RequestMapping
public class VentasApi {

	@Autowired
	private VentasDAO ventasDAO;
	@PostMapping("ventas/guardar")
	public void guardar(@RequestBody Ventas ventas) {
		ventasDAO.save(ventas);
	}
	
	@GetMapping("ventas/listar")
	public List<Ventas> listar(){
		return ventasDAO.findAll();
	}
	
	@DeleteMapping("ventas/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		ventasDAO.deleteById(id);
	}
	
	@PutMapping("ventas/actualizar")
	public void actualizar(@RequestBody Ventas ventas) {
		ventasDAO.save(ventas);
	}
	
	@GetMapping("ventas/listarid/{id}")
	public Optional<Ventas> listar(@PathVariable("id") Long id){
		return ventasDAO.findById(id);
	}
}
