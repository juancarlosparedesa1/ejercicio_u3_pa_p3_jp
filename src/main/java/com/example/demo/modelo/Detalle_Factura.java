package com.example.demo.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="detalle")
public class Detalle_Factura {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "det_seq")
	@SequenceGenerator(name = "det_seq", sequenceName = "det_seq", allocationSize = 1)
	@Column(name="det_id")
	private Integer id;
	
	@Column(name="det_cantidad")
	private Integer cantidad;
	
	@Column(name="det_precio_unitario")
	private BigDecimal precioUnitario;
	
	@Column(name="det_subtotal")
	private BigDecimal subtotal;
	
	@Column(name="det_id_Venta")
	private String idVenta;
	
	@Column(name="det_id_Producto")
	private String idProducto;
	
	//GETTERS AND SETTERS

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public String getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(String idVenta) {
		this.idVenta = idVenta;
	}

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	
	

	

}
