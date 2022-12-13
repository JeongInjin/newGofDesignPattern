package com.example.new_gof_design_pattern._02_observer._observer_2;

public class Lewin implements Crew_Observer {
    @Override
    public void update(String msg) {
        System.out.println("Lewin 수신: " + msg);
    }
}
