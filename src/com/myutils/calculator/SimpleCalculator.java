package com.myutils.calculator;

public class SimpleCalculator {

    public static void main(String[] args) {
        System.out.println("Working from jar file");
        System.out.println(add(1, 5));
        System.out.println(minus(9, 3));
    }

    public static int add(int a, int b) {
        System.out.println("Adding " + a + "and" + b);
        return a + b;
    }

    public static int minus(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
        return a - b;
    }
}
