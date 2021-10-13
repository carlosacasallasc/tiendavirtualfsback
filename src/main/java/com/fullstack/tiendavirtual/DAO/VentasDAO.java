package com.fullstack.tiendavirtual.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fullstack.tiendavirtual.Model.Ventas;

public interface VentasDAO extends JpaRepository<Ventas, Long>{

}
