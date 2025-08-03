package com.espol.viviani.controller;

import com.espol.viviani.view.AppView;

public class AppController {
    private AppView appView;

    public AppController() {
        appView = new AppView();
    }

    // muestra la ventana AppView
    public void run() {
        appView.setVisible(true);
    }
}
