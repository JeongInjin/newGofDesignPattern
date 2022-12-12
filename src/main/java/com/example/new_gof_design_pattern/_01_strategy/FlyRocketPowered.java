package com.example.new_gof_design_pattern._01_strategy;

public class FlyRocketPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("로켓 추진으로 날라갑니다.");
    }
}
