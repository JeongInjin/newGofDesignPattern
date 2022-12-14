package com.example.new_gof_design_pattern._03_decorator.hfd.startbuzzPlusSize;

import static com.example.new_gof_design_pattern._03_decorator.hfd.startbuzzPlusSize.Beverage.Size.*;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == TALL) {
            cost += .20;
        } else if (beverage.getSize() == GRANDE) {
            cost += .25;
        } else if (beverage.getSize() == VENTI) {
            cost += .30;
        }
        return cost;
    }
}
