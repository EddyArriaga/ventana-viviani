package com.espol.viviani.model;

public class Calculator {
    public static double calculatePerimeter(double radio, int n) {
        // calcula la suma de riemann.
        double deltaX = (4.0*Math.PI)/n; // ancho del sub-intervalo
        double sum = 0.00; // se almacenará el resultado de la suma de riemann.

        for (int i = 1; i<=n; i++) {
            double Xi = i*deltaX;

            sum += Math.sqrt(1.00 + Math.pow(Math.cos(Xi/2), 2))*deltaX;
        }
        
        // calcula el perímetro aproximado según el radio.
        double perimeter = (radio/2)*sum;

        return perimeter;
    }
}
