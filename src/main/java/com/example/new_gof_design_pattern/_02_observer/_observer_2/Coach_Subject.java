package com.example.new_gof_design_pattern._02_observer._observer_2;

public interface Coach_Subject {
    void subscribe(Crew_Observer crew);
    void unsubscribe(Crew_Observer crew);
    void notifyCrew(String msg);
}
