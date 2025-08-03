package com.espol.viviani.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

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
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(new EmptyBorder(10, 30, 10, 30));
        mainPanel.setBackground(new Color(255, 255, 255));

            // panel superior
            JPanel topPanel = new JPanel();
            topPanel.setBackground(new Color(255, 255, 255));

                JLabel lb1 = new JLabel("Aproximar perímetro de la curva de la Ventana de Viviani");
                lb1.setForeground(new Color(0, 0, 0));
                lb1.setFont(new Font("Dialog", Font.BOLD, 14));

            topPanel.add(lb1);
            
            // panel que contiene las entradas de datos y que muestra la salida.
            JPanel centerPanel = new JPanel();
            centerPanel.setBackground(new Color(255, 255, 255));
            centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));

                JLabel lbRadius = new JLabel("Radio (cm):");
                lbRadius.setForeground(new Color(0, 0, 0));

                txfRadius = new JTextField();
                txfRadius.setMaximumSize(new Dimension(txfRadius.getMaximumSize().width, 35));
                
                JLabel lbSubIntervals = new JLabel("Cantidad de sub-intervalos:");
                lbSubIntervals.setForeground(new Color(0, 0, 0));

                txfSubIntervals = new JTextField();
                txfSubIntervals.setMaximumSize(new Dimension(txfSubIntervals.getMaximumSize().width, 35));
                
                buttonCalculatePerimeter = new JButton("Calcular perímetro");
                buttonCalculatePerimeter.setForeground(new Color(0, 0, 0));
                buttonCalculatePerimeter.setFocusable(false);

                resultLb = new JLabel("Resultado:");
                resultLb.setForeground(new Color(0, 0, 0));

            centerPanel.add(lbRadius);
            centerPanel.add(Box.createVerticalStrut(5));
            centerPanel.add(txfRadius);
            centerPanel.add(Box.createVerticalStrut(20));
            centerPanel.add(lbSubIntervals);
            centerPanel.add(Box.createVerticalStrut(5));
            centerPanel.add(txfSubIntervals);
            centerPanel.add(Box.createVerticalStrut(20));
            centerPanel.add(buttonCalculatePerimeter);
            centerPanel.add(Box.createVerticalStrut(20));
            centerPanel.add(resultLb);

        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

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
