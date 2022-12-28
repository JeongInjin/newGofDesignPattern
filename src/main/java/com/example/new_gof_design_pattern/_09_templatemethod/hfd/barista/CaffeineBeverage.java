package com.example.new_gof_design_pattern._09_templatemethod.hfd.barista;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void addCondiments();

    private void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    protected abstract void brew();

    private void boilWater() {
        System.out.println("물 끓이는 중");
    }

}
