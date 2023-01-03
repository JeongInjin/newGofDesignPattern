package com.example.new_gof_design_pattern._10_iterator.hfd.implicit_04;

public class MenuTestDrive {
	public static void main(String args[]) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		// Use implicit iteration
		waitress.printMenu();
	}
}
