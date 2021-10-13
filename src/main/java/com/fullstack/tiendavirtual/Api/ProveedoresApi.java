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
import com.fullstack.tiendavirtual.DAO.ProveedoresDAO;
import com.fullstack.tiendavirtual.Model.Proveedores;


@RestController
@RequestMapping
public class ProveedoresApi {

	@Autowired
	private ProveedoresDAO proveedoresDAO;
	@PostMapping("proveedores/guardar")
	public void guardar(@RequestBody Proveedores proveedores) {
		proveedoresDAO.save(proveedores);
	}
	
	@GetMapping("proveedores/listar")
	public List<Proveedores> listar(){
		return proveedoresDAO.findAll();
	}
	
	@DeleteMapping("proveedores/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		proveedoresDAO.deleteById(id);
	}
	
	@PutMapping("proveedores/actualizar")
	public void actualizar(@RequestBody Proveedores proveedores) {
		proveedoresDAO.save(proveedores);
	}
	
	@GetMapping("proveedores/listarid/{id}")
	public Optional<Proveedores> listarId(@PathVariable("id") Long id){
		return proveedoresDAO.findById(id);
	}
}
