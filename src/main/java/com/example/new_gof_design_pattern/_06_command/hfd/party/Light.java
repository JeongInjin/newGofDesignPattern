package com.example.new_gof_design_pattern._06_command.hfd.party;

public class Light {
	String location;
	int level;

	public Light(String location) {
		this.location = location;
	}

	public void on() {
		level = 100;
		System.out.println("Light is on");
	}

	public void off() {
		level = 0;
		System.out.println("Light is off");
	}

	public void dim(int level) {
		this.level = level;
		if (level == 0) {
			off();
		}
		else {
			System.out.println("Light is dimmed to " + level + "%");
		}
	}

	public int getLevel() {
		return level;
	}
}
