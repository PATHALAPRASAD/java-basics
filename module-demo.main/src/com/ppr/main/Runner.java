package com.ppr.main;

import com.ppr.util.Calculator;

public class Runner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(2, 3);
        System.out.println(sum);
    }
}
