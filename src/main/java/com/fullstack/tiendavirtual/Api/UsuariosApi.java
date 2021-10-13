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
import com.fullstack.tiendavirtual.DAO.UsuariosDAO;
import com.fullstack.tiendavirtual.Model.Usuarios;


@RestController
@RequestMapping
public class UsuariosApi {

	@Autowired
	private UsuariosDAO usuariosDAO;
	@PostMapping("usuarios/guardar")
	public void guardar(@RequestBody Usuarios usuarios) {
		usuariosDAO.save(usuarios);
	}
	
	@GetMapping("usuarios/listar")
	public List<Usuarios> listar(){
		return usuariosDAO.findAll();
	}
	
	@DeleteMapping("usuarios/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		usuariosDAO.deleteById(id);
	}
	
	@PutMapping("usuarios/actualizar")
	public void actualizar(@RequestBody Usuarios usuarios) {
		usuariosDAO.save(usuarios);
	}
	
	@GetMapping("usuarios/listarid/{id}")
	public Optional<Usuarios> listarId(@PathVariable("id") Long id){
		return usuariosDAO.findById(id);
	}

}
