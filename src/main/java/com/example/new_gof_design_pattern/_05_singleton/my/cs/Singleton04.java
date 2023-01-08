package com.example.new_gof_design_pattern._05_singleton.my.cs;

/**
 * 정적 블록
 * JVM 로딩시 인스턴스 생성
 * 불필요한 자원낭비일 수 있음
 */
public class Singleton04 {
    private static Singleton04 instance = null;
    private Singleton04() {}

    static {
        instance = new Singleton04();
    }

    public static Singleton04 getInstance() {
        return instance;
    }
}