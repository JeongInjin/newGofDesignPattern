package com.example.new_gof_design_pattern._01_strategy._strategy;

public class SimpleSumStrategy implements SumStrategy{
    @Override
    public int get(int N) {
        int sum = N;

        for (long i = 1; i < N; i++) {
            sum += i;
        }
        return sum;
    }
}
