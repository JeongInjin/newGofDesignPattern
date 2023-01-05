package com.example.new_gof_design_pattern._13_proxy.my.proxy01;

public class Proxy implements Subject{

    private final RealSubject realSubject = new RealSubject();

    @Override
    public String request() {
        return realSubject.request();
    }
}
