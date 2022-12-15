package com.example.new_gof_design_pattern._03_decorator.hfd.pizza;

public abstract class ToppingDecorator extends Pizza {
	Pizza pizza;
	public abstract String getDescription();
}
