package com.educandoweb.educacao.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.educacao.entities.Product;
import com.educandoweb.educacao.repositories.ProductRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	public Product findById(Long id) {
		return productRepository.findById(id).get();
	}
}
