package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.course.repositories.OrderRepository;
import com.example.demo.entities.Order;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderRepository service;

	@GetMapping
	  public ResponseEntity<List<Order>> findAll() {
        List<Order> list = service.findAll();
		
		return ResponseEntity.ok().body(list);	
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id).get();
		return ResponseEntity.ok().body(obj);
	}
	
}




