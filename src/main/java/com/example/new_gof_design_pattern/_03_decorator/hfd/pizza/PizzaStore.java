package com.example.new_gof_design_pattern._03_decorator.hfd.pizza;

public class PizzaStore {
 
	public static void main(String args[]) {
		Pizza pizza = new ThincrustPizza();
		Pizza cheesePizza = new Cheese(pizza);
		Pizza greekPizza = new Olives(cheesePizza);

		System.out.println(greekPizza.getDescription() + " $" + greekPizza.cost());

	}
}
