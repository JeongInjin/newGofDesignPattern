package com.example.new_gof_design_pattern._01_strategy;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("꽥");
    }
}
