package com.example.new_gof_design_pattern._07_adapter.hfd.ducks.challenge;

import com.example.new_gof_design_pattern._07_adapter.hfd.ducks.Duck;

public class DroneAdapter implements Duck {
	Drone drone;
 
	public DroneAdapter(Drone drone) {
		this.drone = drone;
	}
    
	public void quack() {
		drone.beep();
	}
  
	public void fly() {
		drone.spin_rotors();
		drone.take_off();
	}
}
