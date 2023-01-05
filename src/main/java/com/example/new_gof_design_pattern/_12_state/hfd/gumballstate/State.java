package com.example.new_gof_design_pattern._12_state.hfd.gumballstate;

public interface State {

    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();

    public void refill();
}
