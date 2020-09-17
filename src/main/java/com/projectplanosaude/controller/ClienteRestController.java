package com.projectplanosaude.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.projectplanosaude.entity.Cliente;
import com.projectplanosaude.repository.ClienteRepository;


@ResponseBody
@RestController
public class ClienteRestController {
	
	@Autowired
	ClienteRepository dao;
	
	@PostMapping(value = "cliente", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> cadastrarCliente(@RequestBody Cliente cliente){
		
		try {
			Cliente resp = dao.save(cliente);
			if(resp==null) {
				throw new Exception("Dados Gravados");
			}
			return ResponseEntity.status(200).body(resp);
		}catch(Exception ex) {
			Map<String, String> mapa = new HashMap<String, String>();
			mapa.put("erro", "Erro ao Cadastrar: "+ ex.getMessage());
			return ResponseEntity.status(500).body(mapa);
		}
		
	}

}
