package com.example.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crm.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
