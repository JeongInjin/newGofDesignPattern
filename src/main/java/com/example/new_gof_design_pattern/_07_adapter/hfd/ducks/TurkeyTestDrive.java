package com.example.new_gof_design_pattern._07_adapter.hfd.ducks;

import com.example.new_gof_design_pattern._07_adapter.hfd.ducks.challenge.Drone;
import com.example.new_gof_design_pattern._07_adapter.hfd.ducks.challenge.DroneAdapter;
import com.example.new_gof_design_pattern._07_adapter.hfd.ducks.challenge.SuperDrone;

public class TurkeyTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("칠면조가 말하길");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n오리가 말하길");
        testDuck(duck);

        System.out.println("\n칠면조 어댑터가 말하길");
        testDuck(turkeyAdapter);

        // Challenge
        System.out.println("\n드론 어댑터가 말하길");
        Drone drone = new SuperDrone();
        Duck droneAdapter = new DroneAdapter(drone);
        testDuck(droneAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
