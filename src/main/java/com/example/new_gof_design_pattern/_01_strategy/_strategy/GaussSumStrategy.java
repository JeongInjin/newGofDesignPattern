package com.example.new_gof_design_pattern._01_strategy._strategy;

public class GaussSumStrategy implements SumStrategy {
    @Override
    public int get(int N) {
        return (N+1) * N/2;
    }
}
