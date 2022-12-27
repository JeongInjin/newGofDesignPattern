package com.example.new_gof_design_pattern._06_command.hfd.diner;

public class BurgerAndFriesOrder implements Order {
	Cook cook;
	public BurgerAndFriesOrder(Cook cook) {
		this.cook = cook;
	}
	public void orderUp() {
		cook.makeBurger();
		cook.makeFries();
	}
}
