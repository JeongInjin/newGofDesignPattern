package com.example.new_gof_design_pattern._09_templatemethod.hfd.barista;

public class Tea extends CaffeineBeverage{
    @Override
    protected void brew() {
        System.out.println("찻잎을 우려내는 중");
    }

    @Override
    protected void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }
}
