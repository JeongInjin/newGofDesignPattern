package com.example.new_gof_design_pattern;

import com.example.new_gof_design_pattern._01_strategy.Duck;
import com.example.new_gof_design_pattern._01_strategy.FlyRocketPowered;
import com.example.new_gof_design_pattern._01_strategy.MallarDuck;
import com.example.new_gof_design_pattern._01_strategy.ModelDuck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewGofDesignPatternApplication {

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
