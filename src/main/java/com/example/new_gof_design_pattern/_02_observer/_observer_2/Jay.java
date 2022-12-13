package com.example.new_gof_design_pattern._02_observer._observer_2;

public class Jay implements Crew_Observer {
    @Override
    public void update(String msg) {
        System.out.println("Jay 수신: " + msg);
    }
}
