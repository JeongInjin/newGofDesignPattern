package com.example.new_gof_design_pattern._02_observer._observer_2;

import java.util.ArrayList;
import java.util.List;

public class Baedi_Data implements Coach_Subject {

    List<Crew_Observer> crews = new ArrayList<>();

    public void eatFood() {
        System.out.println("Baedi 코치가 밥을 먹는다");
        notifyCrew("(Baedi) 밥 먹었습니다.");
    }

    public void runaway() {
        System.out.println("Baedi 코치가 놀고 있다.");
        notifyCrew("(Baedi) 놀고 있습니다.");
    }

    public void upgradeCuite() {
        System.out.println("Baedi 코치가 귀여워 졌다.");
        notifyCrew("(Baedi) 더 귀요미 됨");
    }


    @Override
    public void subscribe(Crew_Observer crew) {
        crews.add(crew);
    }

    @Override
    public void unsubscribe(Crew_Observer crew) {
        crews.remove(crew);
    }

    @Override
    public void notifyCrew(String msg) {
        for (Crew_Observer crew : crews) {
            crew.update(msg);
        }
    }
}
