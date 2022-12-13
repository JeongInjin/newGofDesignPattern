package com.example.new_gof_design_pattern._02_observer._observer_push;

public interface Observer {
    //정보 변경되었을 때 옵저버에게 전달되는 상태값들.
    public void update(float temp, float humidity, float pressure);
}
