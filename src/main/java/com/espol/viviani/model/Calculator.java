package com.espol.viviani.model;

public class Calculator {
    public static double calculateRiemannSum(int n, MathFunction function) {
        double sum = 0;
        double deltaX = 4.00*Math.PI/n;

        for (int i = 1; i<=n; i++) {
            sum += function.evaluate(i*deltaX)*deltaX;
        }
        return sum;
    }

    public static double calculatePerimeter(double radius, double sum) {
        return (radius/2.00) * sum;
    }
}
