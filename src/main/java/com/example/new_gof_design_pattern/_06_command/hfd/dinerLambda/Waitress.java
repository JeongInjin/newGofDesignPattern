package com.example.new_gof_design_pattern._06_command.hfd.dinerLambda;

public class Waitress {
	Order order;
	public Waitress() {}
	public void takeOrder(Order order) {
		this.order = order; 
		order.orderUp();
	}
}