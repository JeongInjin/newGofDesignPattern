package com.example.new_gof_design_pattern._09_templatemethod.hfd.ex_simplebarista;

public class Barista {
 
	public static void main(String[] args) {
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
		System.out.println("차 만드는 중...");
		tea.prepareRecipe();
		System.out.println("\n커피 만드는 중...");
		coffee.prepareRecipe();
	}
}
