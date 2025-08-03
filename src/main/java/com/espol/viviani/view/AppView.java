package com.espol.viviani.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AppView extends JFrame {
    private JTextField txfRadius;
    private JTextField txfSubIntervals;
    private JButton buttonCalculatePerimeter;
    private JLabel resultLb;

    public AppView() {
        // propiedades de la ventana JFrame
        setTitle("Ventana de viviani");
        setSize(new Dimension(500, 360));
        setResizable(false);
        // setMinimumSize(new Dimension(500, 360));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        init();
    }

    // inicializa los componentes
    private void init() {
        JPanel mainPanel = new JPanel(new BorderLayout());
            
            // panel que contiene las entradas de datos y que muestra la salida.
            JPanel centerPanel = new JPanel();
            centerPanel.setBackground(new Color(255, 255, 255));
            centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
            centerPanel.setBorder(new EmptyBorder(10, 20, 10, 20));

                JLabel lbRadius = new JLabel("Radio (cm):");
                txfRadius = new JTextField();
                txfRadius.setMaximumSize(new Dimension(txfRadius.getMaximumSize().width, 35));
                
                JLabel lbSubIntervals = new JLabel("Cantidad de sub-intervalos:");
                txfSubIntervals = new JTextField();
                txfSubIntervals.setMaximumSize(new Dimension(txfSubIntervals.getMaximumSize().width, 35));
                
                buttonCalculatePerimeter = new JButton("Calcular perímetro");

                resultLb = new JLabel("Resultado: 0.00000 cm");

            centerPanel.add(lbRadius);
            centerPanel.add(txfRadius);
            centerPanel.add(Box.createVerticalStrut(20));
            centerPanel.add(lbSubIntervals);
            centerPanel.add(txfSubIntervals);
            centerPanel.add(Box.createVerticalStrut(20));
            centerPanel.add(buttonCalculatePerimeter);
            centerPanel.add(Box.createVerticalStrut(20));
            centerPanel.add(resultLb);

            // panel que muestra el historial de perímetros calculados
            JPanel rightPanel = new JPanel(new BorderLayout());
            rightPanel.setPreferredSize(new Dimension(200, rightPanel.getPreferredSize().height));

        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(rightPanel, BorderLayout.EAST);

        this.add(mainPanel);
    }

    public JTextField getTxfRadius() {
        return txfRadius;
    }

    public JTextField getTxfSubIntervals() {
        return txfSubIntervals;
    }

    public JButton getButtonCalculatePerimeter() {
        return buttonCalculatePerimeter;
    }

    public JLabel getResultLb() {
        return resultLb;
    }
}
