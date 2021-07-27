package com.natwest.demo.fruit.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natwest.demo.fruit.persistence.domain.Fruit;

@Repository
public interface FruitRepo extends JpaRepository<Fruit, Long> {

	
}
