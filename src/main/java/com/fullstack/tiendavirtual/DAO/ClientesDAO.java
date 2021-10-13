package com.fullstack.tiendavirtual.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstack.tiendavirtual.Model.Clientes;

public interface ClientesDAO extends JpaRepository<Clientes, Long>{

}
