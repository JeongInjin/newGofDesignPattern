package com.example.new_gof_design_pattern._02_observer._observer_1;

public class EventPrinter implements Observer{

    @Override
    public void onEvent(int count) {
        System.out.printf(count + " -");
    }
    public void start() {
        Count count = new Count(this);
        count.count();
    }
}
