package com.example.new_gof_design_pattern._03_decorator.hfd.startbuzz;

public abstract class Beverage {
    String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
