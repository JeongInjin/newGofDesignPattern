package com.example.new_gof_design_pattern._07_adapter.hfd.ducks;

public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("꽥");
    }

    @Override
    public void fly() {
        System.out.println("날고 있어요");
    }
}
