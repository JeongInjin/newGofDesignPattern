package com.example.new_gof_design_pattern._01_strategy;

import com.example.new_gof_design_pattern.NewGofDesignPatternApplication;
import org.springframework.boot.SpringApplication;

public class DuckMain {
    public static void main(String[] args) {
        SpringApplication.run(NewGofDesignPatternApplication.class, args);

        Duck mallard = new MallarDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("==============================================");

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
