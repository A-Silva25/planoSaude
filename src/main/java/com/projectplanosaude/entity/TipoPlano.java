package com.projectplanosaude.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="tipoplano")
public class TipoPlano implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idTipoPlano;
	
	@Column
	private String nomePlano;
	
	@Column
	private Double valor;
	
	@OneToOne
	@JoinColumn(name = "idClienteFk", referencedColumnName = "idCliente")
	@JsonManagedReference
	private Cliente cliente;
	
	public TipoPlano() {
	
	}
	
	public TipoPlano(Long idTipoPlano, String nomePlano, Double valor, Cliente cliente) {
		super();
		this.idTipoPlano = idTipoPlano;
		this.nomePlano = nomePlano;
		this.valor = valor;
		this.cliente = cliente;
	}

	public Long getIdTipoPlano() {
		return idTipoPlano;
	}
	public void setIdTipoPlano(Long idTipoPlano) {
		this.idTipoPlano = idTipoPlano;
	}
	public String getNomePlano() {
		return nomePlano;
	}
	public void setNomePlano(String nomePlano) {
		this.nomePlano = nomePlano;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
