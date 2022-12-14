package com.example.new_gof_design_pattern._03_decorator.hfd.startbuzzPlusSize.startbuzz;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();

    public Size getSize() {
        return beverage.getSize();
    }
}
