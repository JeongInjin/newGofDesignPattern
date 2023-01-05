package com.example.new_gof_design_pattern._13_proxy.hfd.gumballmonitor;

import java.io.Serializable;

public interface State extends Serializable {
 
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}
