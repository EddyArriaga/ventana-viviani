package com.espol.viviani.controller;

import com.espol.viviani.model.Calculator;
import com.espol.viviani.model.IntegrandFunction;
import com.espol.viviani.util.InputValidator;
import com.espol.viviani.view.AppView;

public class AppController {
    private AppView appView;

    public AppController() {
        appView = new AppView();
        
        appView.getCalculateButton().addActionListener(e -> calculatePerimeter());
    }

    private void calculatePerimeter() {
        String radius = appView.getRadiusField().getText();
        String subIntervals = appView.getSubIntervalsField().getText();

        if (InputValidator.validateFullField(subIntervals) && InputValidator.validateFullField(radius)) {
            if (InputValidator.isPositiveInteger(subIntervals) && (InputValidator.isPositiveDecimal(radius) || InputValidator.isPositiveInteger(radius))) {
                IntegrandFunction integrandFunction = new IntegrandFunction();

                double riemannSum = Calculator.calculateRiemannSum(Integer.parseInt(subIntervals), integrandFunction);
                double perimeter = Calculator.calculatePerimeter(Double.parseDouble(radius), riemannSum);

                appView.getResult().setText("Resultado: " + String.format("%.4f", perimeter) + " [cm]");
            } else {
                appView.getResult().setText("Campos no permitidos.");
            }
        } else {
            appView.getResult().setText("No se permite campos vacíos.");
        }
    }
}
