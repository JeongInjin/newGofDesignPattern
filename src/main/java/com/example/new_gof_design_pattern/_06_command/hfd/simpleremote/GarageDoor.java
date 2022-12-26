package com.example.new_gof_design_pattern._06_command.hfd.simpleremote;

public class GarageDoor {

	public GarageDoor() {
	}

	public void up() {
		System.out.println("차고 문이 열렸습니다.");
	}

	public void down() {
		System.out.println("차고 문이 닫혔습니다.");
	}

	public void stop() {
		System.out.println("차고 문이 멈췄습니다.");
	}

	public void lightOn() {
		System.out.println("차고 조명이 켜졌습니다.");
	}

	public void lightOff() {
		System.out.println("차고 조명이 꺼졌습니다.");
	}
}
