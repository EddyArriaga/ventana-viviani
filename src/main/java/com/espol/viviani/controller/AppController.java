package com.espol.viviani.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.espol.viviani.model.Calculator;
import com.espol.viviani.view.AppView;

public class AppController {
    private AppView appView;

    public AppController() {
        appView = new AppView();
        
        appView.getButtonCalculatePerimeter().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double radius = Double.parseDouble(appView.getTxfRadius().getText());
                int numSubIntervals = Integer.parseInt(appView.getTxfSubIntervals().getText());

                double perimeter = Calculator.calculatePerimeter(radius, numSubIntervals);

                appView.getResultLb().setText("Resultado: " + String.format("%.5f", perimeter) + " cm");
            }
        });
    }

    // muestra la ventana AppView
    public void run() {
        appView.setVisible(true);
    }
}
