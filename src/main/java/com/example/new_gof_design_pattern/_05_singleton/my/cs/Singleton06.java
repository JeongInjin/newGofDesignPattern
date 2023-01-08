package com.example.new_gof_design_pattern._05_singleton.my.cs;

/**
 * 이중 확인 장금(DCL: Double Checked Locking)
 * volatile: 자바 변수를 메인 메모리에 저장을 명시.
 */
public class Singleton06 {
    private static volatile Singleton06 instance;
    private Singleton06() {}

    private Singleton06 getInstance() {
        if (instance == null) {
            synchronized (Singleton06.class) {
                if (instance == null) {
                    instance = new Singleton06();
                }
            }
        }
        return instance;
    }
}
