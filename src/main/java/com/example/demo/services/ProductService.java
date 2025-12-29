package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.course.repositories.ProductRepository;
import com.example.demo.entities.Products;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Products> findALL() {
		return repository.findAll();
	}

	public Products findById(Long id) {
		Optional<Products> obj = repository.findById(id);
		return obj.get();
	}
}
