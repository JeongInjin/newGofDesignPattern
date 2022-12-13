package com.example.new_gof_design_pattern._02_observer._observer_1;

public class Count {
    Observer observers;
    public Count(Observer observer) {
        observers = observer;
    }

    public void count() {
        System.out.println("asdasdasd");
        for (int i = 1; i < 100; i++) {
            if(i % 5 == 0) observers.onEvent(i);

        }
    }
}
