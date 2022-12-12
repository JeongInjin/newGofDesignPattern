package com.example.new_gof_design_pattern._01_strategy._strategy;

public class SumPrinter {
    void print(SumStrategy strategy, int N) {
        System.out.printf("The Sum of 1 - %d: ", N);
        System.out.println(strategy.get(N));
    }
}
