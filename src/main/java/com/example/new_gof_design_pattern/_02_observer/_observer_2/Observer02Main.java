package com.example.new_gof_design_pattern._02_observer._observer_2;

public class Observer02Main {
    public static void main(String[] args) {
        Baedi_Data baedi = new Baedi_Data();

        Crew_Observer lewin = new Lewin();
        Crew_Observer jay = new Lewin();
        Crew_Observer tiber = new Lewin();

        baedi.subscribe(lewin);
        baedi.subscribe(jay);
        baedi.subscribe(tiber);

        System.out.println("==========================================");
        baedi.upgradeCuite();
        baedi.runaway();
        System.out.println("==========================================");
    }
}
