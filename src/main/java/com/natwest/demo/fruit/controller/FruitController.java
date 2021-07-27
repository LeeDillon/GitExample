package com.natwest.demo.fruit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.natwest.demo.fruit.persistence.domain.Fruit;
import com.natwest.demo.fruit.service.FruitService;

@RestController
public class FruitController {

	@Autowired
	private FruitService service;

	public FruitController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Fruit>> getAll() {
		return new ResponseEntity<List<Fruit>>(this.service.readAll(), HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<Fruit> createFruit(@RequestBody Fruit fruit) {
		return new ResponseEntity<Fruit>(this.service.createFruit(fruit), HttpStatus.CREATED);
	}

	@GetMapping("/findbyid/{id}")
	public ResponseEntity<Fruit> findById(@PathVariable("id") Long id) {
		return new ResponseEntity<Fruit>(this.service.findById(id), HttpStatus.FOUND);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Fruit> updateFruit(@PathVariable("id") Long id, @RequestBody Fruit fruit) {
		return new ResponseEntity<Fruit>(this.service.updateFruit(id, fruit), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> deleteFruit(@PathVariable Long id) {
		return new ResponseEntity<Boolean>(this.service.deleteFruit(id), HttpStatus.NO_CONTENT);
	}

}
