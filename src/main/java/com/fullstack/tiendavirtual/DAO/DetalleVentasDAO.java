package com.fullstack.tiendavirtual.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fullstack.tiendavirtual.Model.DetalleVentas;

public interface DetalleVentasDAO extends JpaRepository<DetalleVentas, Long>{
	

}
