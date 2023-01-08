package com.example.new_gof_design_pattern._05_singleton.my.cs;

/**
 * 정적 멤버와 LazyHolder(중첩클래스)
 * 내부클래스를 만들어 초기화를 미루고, getInstance 메서드가 호출될 때 클래스가 로딩 -> 인스턴스 생성 됨.
 */
class Singleton05 {
    private static class singleInstanceHolder {
        private static final Singleton05 INSTANCE = new Singleton05();
    }

    public static Singleton05 getInstance() {
        return singleInstanceHolder.INSTANCE;
    }
}