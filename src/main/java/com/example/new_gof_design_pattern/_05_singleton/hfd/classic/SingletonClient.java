package com.example.new_gof_design_pattern._05_singleton.hfd.classic;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
