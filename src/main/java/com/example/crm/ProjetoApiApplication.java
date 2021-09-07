package com.example.crm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.crm.model.Cliente;
import com.example.crm.model.Produto;

@SpringBootApplication
public class ProjetoApiApplication implements CommandLineRunner {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "SELECT * FROM Cliente";
		List<Cliente> Cliente = jdbcTemplate.query(sql, 
				BeanPropertyRowMapper.newInstance(Cliente.class));
		
		Cliente.forEach(System.out :: println);
		
	}
	
	public void run1(String... args) throws Exception {
		String sql = "SELECT * FROM Produto";
		List<Produto> Produto = jdbcTemplate.query(sql, 
				BeanPropertyRowMapper.newInstance(Produto.class));
		
		Produto.forEach(System.out :: println);
	

}
}

