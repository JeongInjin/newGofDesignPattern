package com.example.new_gof_design_pattern._01_strategy;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("삐걱삐걱");
    }
}
