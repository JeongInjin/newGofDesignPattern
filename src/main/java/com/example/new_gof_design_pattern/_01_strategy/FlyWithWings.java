package com.example.new_gof_design_pattern._01_strategy;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("날고 있어요 !");
    }
}
