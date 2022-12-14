package com.example.new_gof_design_pattern._03_decorator.hfd.startbuzz;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "하우스 블렌드 커피";
    }

    @Override
    public double cost() {
        return .89;
    }
}
