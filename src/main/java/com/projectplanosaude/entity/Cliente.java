package com.projectplanosaude.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	
	@Column(length = 50)
	@NotNull(message = "O nome não pode está vazio")
	@Pattern(regexp = "[a-z A-Z]{2,50}", message = "Nome invalido")
	private String nome;
	
	@Column(length = 50)
	@Email(message = "Fora do padrão do email")
	@NotNull(message = "O email não pode está vazio")
	private String email;
	
	@Column(length= 11)
	@Pattern(regexp = "[0-9]{10,11}", message = "Telefone invalido")
	private String telefone;
	
	@Column
	@Pattern(regexp = "[0-9]", message = "Quantidade de Dependentes invalida")
	private Integer dependente;
	
	@OneToOne(mappedBy = "cliente", cascade = {CascadeType.ALL})
	@JsonManagedReference
	private Endereco endereco;
	
	@OneToOne(mappedBy = "cliente", cascade = {CascadeType.ALL})
	private TipoPlano tipoPlano;
	
	public Cliente() {
	
	}

	public Cliente(Long idCliente,
			@NotNull(message = "O nome não pode está vazio") @Pattern(regexp = "[a-z A-Z]{2,50}", message = "Nome invalido") String nome,
			@Email(message = "Fora do padrão do email") @NotNull(message = "O email não pode está vazio") String email,
			@Pattern(regexp = "[0-9]{10,11}", message = "Telefone invalido") String telefone,
			@Pattern(regexp = "[0-9]", message = "Quantidade de Dependentes invalida") Integer dependente) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.dependente = dependente;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone
				+ ", dependente=" + dependente + "]";
	}

	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Integer getDependente() {
		return dependente;
	}
	public void setDependente(Integer dependente) {
		this.dependente = dependente;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public TipoPlano getTipoPlano() {
		return tipoPlano;
	}
	public void setTipoPlano(TipoPlano tipoPlano) {
		this.tipoPlano = tipoPlano;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
