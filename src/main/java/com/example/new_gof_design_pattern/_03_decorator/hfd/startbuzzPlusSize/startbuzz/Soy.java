package com.example.new_gof_design_pattern._03_decorator.hfd.startbuzzPlusSize.startbuzz;

import static com.example.new_gof_design_pattern._03_decorator.hfd.startbuzzPlusSize.startbuzz.Beverage.Size.*;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == TALL) {
            cost += .10;
        } else if (beverage.getSize() == GRANDE) {
            cost += .15;
        } else if (beverage.getSize() == VENTI) {
            cost += .20;
        }
        return cost;
    }
}
