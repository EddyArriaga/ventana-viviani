package com.espol.viviani.model;

public class IntegrandFunction implements MathFunction {
    @Override
    public double evaluate(double x) {
        return Math.sqrt(1.00 + Math.pow(Math.cos(x/2.00), 2.00));
    }
}
