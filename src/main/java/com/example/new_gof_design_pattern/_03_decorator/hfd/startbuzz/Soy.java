package com.example.new_gof_design_pattern._03_decorator.hfd.startbuzz;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
