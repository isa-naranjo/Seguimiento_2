package model;

import java.util.ArrayList;
import java.util.List;

import exceptions.NegativeNumberException;

public class Recipe {
	private List<Ingredient> ingredients;
	
	public Recipe() {
		ingredients = new ArrayList<Ingredient>();
	}
	
	public void addIngredient(String name, double weight) throws NegativeNumberException{
		
		Ingredient searched = null;
		for (int i = 0; i < ingredients.size() && searched==null; i++) {
			Ingredient current = ingredients.get(i);
			if(current.getName().equals(name)) {
				searched = current;
			}
		}
		
		if(searched!=null) {
			searched.addWeight(weight);
		}else {
			Ingredient newIngredient = new Ingredient(name, weight);
			ingredients.add(newIngredient);
		}		
	}
	
	public void removeIngredient(String name) {
		if(!ingredients.isEmpty()) {
			for(int i=0; i<ingredients.size();i++) {
				if(ingredients.get(i).getName().equalsIgnoreCase(name)) {
					ingredients.remove(i);
					i=ingredients.size();
				}
			}
		}
	}
	
	public List<Ingredient> getIngredients(){
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	
	
	
}

