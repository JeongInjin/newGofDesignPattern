package com.example.new_gof_design_pattern._03_decorator.hfd.startbuzz;
 
public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", 휘핑크림";
	}
 
	public double cost() {
		return .10 + beverage.cost();
	}
}
