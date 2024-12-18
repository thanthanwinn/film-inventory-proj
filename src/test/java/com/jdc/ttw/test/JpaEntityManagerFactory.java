package com.jdc.ttw.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
@TestMethodOrder(OrderAnnotation.class)
public class JpaEntityManagerFactory {

	
	EntityManagerFactory emf;
	
	@BeforeAll
	public void init() {
		emf = Persistence.createEntityManagerFactory("film-inventory-proj");
	}
	
	@Test
	void tst() {
		
	}
}
