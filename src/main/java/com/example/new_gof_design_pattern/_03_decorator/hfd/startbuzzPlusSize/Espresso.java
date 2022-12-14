package com.example.new_gof_design_pattern._03_decorator.hfd.startbuzzPlusSize;

public class Espresso extends Beverage {

    public Espresso() {
        description = "에스프레소";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
