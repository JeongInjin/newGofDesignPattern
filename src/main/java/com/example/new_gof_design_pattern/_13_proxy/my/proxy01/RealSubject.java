package com.example.new_gof_design_pattern._13_proxy.my.proxy01;

public class RealSubject implements Subject{
    @Override
    public String request() {
        return "Hello World";
    }
}
