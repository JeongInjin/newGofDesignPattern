package com.example.new_gof_design_pattern._05_singleton.my.cs;

/**
 * 원자성이 결어
 * 멀티쓰레드에서의 버그
 */
public class Singleton01 {
    private static Singleton01 instance;

    private Singleton01() {}

    public static Singleton01 getInstance1() {
        if (instance == null) {
            instance = new Singleton01();
        }
        return instance;
    }
}
