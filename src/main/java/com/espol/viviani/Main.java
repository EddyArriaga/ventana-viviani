package com.espol.viviani;

import com.espol.viviani.model.Calculator;

public class Main {

    /*
    Elaboración de un programa ejecutable, en el lenguaje de su elección, que
    aproxime el perímetro de una Ventana de Viviani, generada a partir de una
    esfera de radio R dado en centímetros, programando una suma de Riemann
    de la función sub-integral que se emplea para el cálculo de longitud de arco.
    El programa debe permitir que el usuario ingrese el valor de R en centímetros
    y la cantidad de sub-intervalos elegidos para la aproximación.
    */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Calculator.calcPerimetro(4, Calculator.calculateSumaRiemann(500));
    }


}