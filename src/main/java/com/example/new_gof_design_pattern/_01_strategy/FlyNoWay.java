package com.example.new_gof_design_pattern._01_strategy;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("저는 못 날아요.");
    }
}
