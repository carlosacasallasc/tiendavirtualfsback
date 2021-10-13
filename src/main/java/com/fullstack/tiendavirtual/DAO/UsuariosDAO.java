package com.fullstack.tiendavirtual.DAO;
import com.fullstack.tiendavirtual.Model.Usuarios;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosDAO extends JpaRepository<Usuarios, Long> {

	
}
