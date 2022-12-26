package com.example.new_gof_design_pattern._05_singleton.hfd.classic;

/**
 * 해당 코드는 멀티스레드 환경에서 취약하다.
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null)
            instance = new Singleton();
        return instance;
    }

    public String getDescription() {
        return "I'm a classic Singleton!";
    }
}
