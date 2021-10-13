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
import com.fullstack.tiendavirtual.DAO.ProductosDAO;
import com.fullstack.tiendavirtual.Model.Productos;


@RestController
@RequestMapping
public class ProductosApi {

	@Autowired
	private ProductosDAO productosDAO;
	@PostMapping("productos/guardar")
	public void guardar(@RequestBody Productos productos) {
		productosDAO.save(productos);
	}
	
	@GetMapping("productos/listar")
	public List<Productos> listar(){
		return productosDAO.findAll();
	}
	
	@DeleteMapping("productos/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		productosDAO.deleteById(id);
	}
	
	@PutMapping("productos/actualizar")
	public void actualizar(@RequestBody Productos productos) {
		productosDAO.save(productos);
	}
	
	@GetMapping("productos/listarid/{id}")
	public Optional<Productos> listarId(@PathVariable("id") Long id){
		return productosDAO.findById(id);
	}
}
