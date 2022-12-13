package com.example.new_gof_design_pattern._02_observer._observer_pull;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}

