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
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="endereco")
public class Endereco implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEndereco;
	
	@Column
	private String estado;
	
	@Column
	private String cidade;
	
	@Column
	private String bairro;
	
	@Column
	private String rua;
	
	@Column
	private String complemento;
	
	@Column
	@Pattern(regexp = "[0-9]", message = "Numero invalido")
	private Integer numero;
	
	@Column(length = 8)
	@Pattern(regexp = "[0-9]{8,8}", message = "CEP invalido")
	private Integer cep;
	
	@OneToOne
	@JoinColumn(name = "idClienteFk", referencedColumnName = "idCliente")
	@JsonManagedReference
	private Cliente cliente;
	
	public Endereco() {
	
	}
	
	public Endereco(Long idEndereco, String estado, String cidade, String bairro, String rua, String complemento,
			@Pattern(regexp = "[0-9]", message = "Numero invalido") Integer numero,
			@Pattern(regexp = "[0-9]{8,8}", message = "CEP invalido") Integer cep, Cliente cliente) {
		super();
		this.idEndereco = idEndereco;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.complemento = complemento;
		this.numero = numero;
		this.cep = cep;
		this.cliente = cliente;
	}



	public Long getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getCep() {
		return cep;
	}
	public void setCep(Integer cep) {
		this.cep = cep;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
