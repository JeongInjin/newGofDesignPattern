package com.example.new_gof_design_pattern._02_observer._observer_1;


public class ButtonMain {
    public static void main(String[] args) {
        EventPrinter eventPrinter = new EventPrinter();
        eventPrinter.start();
    }
}
