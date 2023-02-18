package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="factura")
public class Factura {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fact_seq")
	@SequenceGenerator(name = "fact_seq", sequenceName = "fact_seq", allocationSize = 1)
	@Column(name="fact_id")
	private Integer id;
	
	@Column(name="fact_numero")
	private Integer numero;
	
	@Column(name="fact_fecha")
	private LocalDate fecha;
	
	@Column(name="fact_cedula")
	private String cedula;
	
	@Column(name="fact_total")
	private BigDecimal total;
	
	//GETERS AND SETTERS

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	
	
	

	


}
