package com.example.new_gof_design_pattern._13_proxy.my.proxy01;

public class ProxyTest {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        System.out.println(subject.request());
    }
}
