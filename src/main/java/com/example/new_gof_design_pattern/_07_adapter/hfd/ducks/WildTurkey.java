package com.example.new_gof_design_pattern._07_adapter.hfd.ducks;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("골골");
    }

    @Override
    public void fly() {
        System.out.println("짧은 거리를 날고 있어요!");
    }
}
