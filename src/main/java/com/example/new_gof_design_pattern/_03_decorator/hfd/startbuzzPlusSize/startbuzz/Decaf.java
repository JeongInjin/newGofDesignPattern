package com.example.new_gof_design_pattern._03_decorator.hfd.startbuzzPlusSize.startbuzz;

public class Decaf extends Beverage {

    public Decaf() {
        description = "디카페 커피";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
