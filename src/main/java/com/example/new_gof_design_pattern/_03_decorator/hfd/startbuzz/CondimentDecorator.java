package com.example.new_gof_design_pattern._03_decorator.hfd.startbuzz;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
