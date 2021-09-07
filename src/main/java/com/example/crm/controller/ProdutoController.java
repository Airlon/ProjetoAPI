package com.example.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.crm.model.Produto;
import com.example.crm.repository.ProdutoRepository;

@RestController
@RequestMapping("/Produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> listar () {
		return produtoRepository.findAll();
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Produto adicionar (@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	

}

}
