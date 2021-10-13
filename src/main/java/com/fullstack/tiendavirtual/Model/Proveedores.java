package com.fullstack.tiendavirtual.Model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Proveedores {

	@Id
	private long nit_proveedor;
	private String ciudad_proveedor;
	private String direccion_proveedor;
	private String nombre_provedor;
	private String telefono_proveedor;
	
	
	public long getNit_proveedor() {
		return nit_proveedor;
	}
	public void setNit_proveedor(long nit_proveedor) {
		this.nit_proveedor = nit_proveedor;
	}
	public String getCiudad_proveedor() {
		return ciudad_proveedor;
	}
	public void setCiudad_proveedor(String ciudad_proveedor) {
		this.ciudad_proveedor = ciudad_proveedor;
	}
	public String getDireccion_proveedor() {
		return direccion_proveedor;
	}
	public void setDireccion_proveedor(String direccion_proveedor) {
		this.direccion_proveedor = direccion_proveedor;
	}
	public String getNombre_provedor() {
		return nombre_provedor;
	}
	public void setNombre_provedor(String nombre_provedor) {
		this.nombre_provedor = nombre_provedor;
	}
	public String getTelefono_proveedor() {
		return telefono_proveedor;
	}
	public void setTelefono_proveedor(String telefono_proveedor) {
		this.telefono_proveedor = telefono_proveedor;
	}
}
