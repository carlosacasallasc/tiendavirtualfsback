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
import com.fullstack.tiendavirtual.DAO.ClientesDAO;
import com.fullstack.tiendavirtual.Model.Clientes;


@RestController
@RequestMapping
public class ClientesApi {

	@Autowired
	private ClientesDAO clientesDAO;
	@PostMapping("clientes/guardar")
	public void guardar(@RequestBody Clientes clientes) {
		clientesDAO.save(clientes);
	}
	
	@GetMapping("clientes/listar")
	public List<Clientes> listar(){
		return clientesDAO.findAll();
	}
	
	@DeleteMapping("clientes/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		clientesDAO.deleteById(id);
	}
	
	@PutMapping("clientes/actualizar")
	public void actualizar(@RequestBody Clientes clientes) {
		clientesDAO.save(clientes);
	}
}
