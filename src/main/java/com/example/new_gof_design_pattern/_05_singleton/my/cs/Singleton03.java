package com.example.new_gof_design_pattern._05_singleton.my.cs;

/**
 * 정적 멤버
 * JVM 로딩시 인스턴스 생성
 * 불필요한 자원낭비일 수 있음
 */
public class Singleton03 {
    private final static Singleton03 instance = new Singleton03();
    private Singleton03() {
    }
    public static Singleton03 getInstance() {
        return instance;
    }
}