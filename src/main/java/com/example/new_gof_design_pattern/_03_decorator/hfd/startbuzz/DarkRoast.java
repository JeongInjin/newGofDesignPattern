package com.example.new_gof_design_pattern._03_decorator.hfd.startbuzz;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "다크로스트 커피";
    }

    @Override
    public double cost() {
        return .99;
    }
}
