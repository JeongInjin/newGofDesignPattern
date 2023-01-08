package com.example.new_gof_design_pattern._05_singleton.my.cs;

/**
 * synchronized 키워드로 단일 인스턴스 확보
 * 속도가 느림
 */
public class Singleton02 {
    private static Singleton02 instance;
    private Singleton02() { }
    public static synchronized Singleton02 getInstance() { if (instance == null) {
        instance = new Singleton02(); }
        return instance; }
}