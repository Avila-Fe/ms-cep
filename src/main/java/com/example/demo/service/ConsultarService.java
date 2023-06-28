package com.example.demo.service;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Cep;

@Service
public class ConsultarService {
	
	public Cep consultaCep(String cep) {
		return new RestTemplate().getForEntity("https://viacep.com.br/ws/" +cep+ "/json/", Cep.class).getBody();
	}
}
