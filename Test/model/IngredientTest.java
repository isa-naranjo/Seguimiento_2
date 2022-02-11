package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exceptions.NegativeNumberException;

class IngredientTest {

	// Estado 
	
	private Ingredient ingredient;
	
	
	// Esenario
	
	public void setupStage1() {
		
		ingredient = new Ingredient ("Tomate", 245); 
	}
	
	// Caso de prueba
	@Test
	void test1()  {
		setupStage1();
		ingredient.addWeight(54);
		
		//aseerts
		
		assertEquals(299,ingredient.getWeight());
		
	}
	
	@Test
	void test2()  {
		setupStage1();
		boolean exception = false;
		try {
			
			ingredient.addWeight(-100);
			
		} catch (NegativeNumberException e) {
			e.printStackTrace();
			exception=true;
		} 
		
		//aseerts
		
		assertTrue(exception);
		
	}
	
	@Test
	void test3()  {
		setupStage1();
		ingredient.removeWeight(45);
		
		//aseerts
		
		assertEquals(200, ingredient.getWeight());
		
	}
	@Test
	void test4()  {
		setupStage1();
		
		boolean exception = false;
		try {
			
			ingredient.removeWeight(-100);
			
		} catch (NegativeNumberException e) {
			e.printStackTrace();
			exception=true;
		} 
		
		//aseerts
		assertFalse(exception);
		
	}

}
