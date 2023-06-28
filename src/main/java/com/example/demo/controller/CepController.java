package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Cep;
import com.example.demo.service.ConsultarService;

@RestController
public class CepController {

	@Autowired
	private ConsultarService consult;

	@ResponseBody
	@GetMapping(value = "**/consultaCep/{cep}")
	public ResponseEntity<Cep> consultaCep(@PathVariable("cep") String cep) {
		Cep cepConsult = consult.consultaCep(cep);
		return new ResponseEntity<Cep>(cepConsult, HttpStatus.OK);
	}
}
