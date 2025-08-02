package com.espol.viviani.model;

public class Calculator {
    public static double calculateSumaRiemann(int numIntervalos) {
        double subIntervalos = (2.0*Math.PI) / numIntervalos;
        
        //recorrera "numIntervalos" vueltas
        double suma = 0;

        for(int i = 1; i<=numIntervalos; i++) {
            suma += Math.sqrt(1+Math.pow(Math.cos(i*subIntervalos), 2))*subIntervalos;
        }

        return suma;
    }

    public static void calcPerimetro(double radio, double suma) {
        double longitud = radio*suma;

        System.out.println(longitud);
    }
}
