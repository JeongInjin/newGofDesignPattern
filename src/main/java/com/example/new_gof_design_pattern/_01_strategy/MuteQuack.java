package com.example.new_gof_design_pattern._01_strategy;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("[[ 조용~ ]]");
    }
}
