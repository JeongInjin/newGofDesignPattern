package com.example.new_gof_design_pattern._05_singleton.dcl;

/**
 * 해당 코드는 자바5 버전 이전에는 동기화가 보장되지 않음.
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
