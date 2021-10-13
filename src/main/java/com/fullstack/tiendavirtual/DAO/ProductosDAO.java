package com.fullstack.tiendavirtual.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstack.tiendavirtual.Model.Productos;

public interface ProductosDAO extends JpaRepository<Productos, Long>{

}
