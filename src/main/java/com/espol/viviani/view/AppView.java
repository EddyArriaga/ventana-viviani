package com.espol.viviani.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AppView extends JFrame {
    private final Color COLOR_BLACK = new Color(0, 0, 0);
    private final Color COLOR_WHITE = new Color(255, 255, 255);

    private JTextField radiusField;
    private JTextField subIntervalsField;
    private JButton calculateButton;
    private JLabel result;

    public AppView() {
        configureWindow();
        initializeComponents();
        setVisible(true);
    }

    // establece las propiedades de la ventana
    private void configureWindow() {
        setTitle("Ventana de Viviani");
        setSize(560,380);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    // inicializa los componentes
    private void initializeComponents() {
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(createTitlePanel(), BorderLayout.NORTH);
        mainPanel.add(createInteractionPanel(), BorderLayout.CENTER);
        mainPanel.add(createImgPanel(), BorderLayout.EAST);
        
        add(mainPanel);
    }

    // crea el panel de título
    private JPanel createTitlePanel() {
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 8, 8));
        titlePanel.setBackground(COLOR_BLACK);

            JLabel title = new JLabel("Curva de la Ventana de Viviani");
            title.setForeground(COLOR_WHITE);
            title.setFont(new Font("Dialog", Font.BOLD, 16));

        titlePanel.add(title);

        return titlePanel;
    }

    // crea el panel de interacción (es con el que el usuario interactúa)
    private JPanel createInteractionPanel() {
        JPanel interactionPanel = new JPanel(new BorderLayout());
        interactionPanel.add(createInputPanel(), BorderLayout.CENTER);
        interactionPanel.add(createOutputPanel(), BorderLayout.SOUTH);

        return interactionPanel;
    }

    // crea el panel de entrada
    private JPanel createInputPanel() {
        JPanel inputPanel = new JPanel();
        inputPanel.setBorder(new EmptyBorder(12, 12, 12, 12));
        inputPanel.setBackground(COLOR_WHITE);
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));

        JLabel radiusLabel = new JLabel("Radio [cm]:");
        radiusField = new JTextField();
        radiusField.setMaximumSize(new Dimension(radiusField.getMaximumSize().width, 35));
        
        JLabel subIntervalsLabel = new JLabel("Cantidad de sub-intervalos: ");
        subIntervalsField = new JTextField();
        subIntervalsField.setMaximumSize(new Dimension(subIntervalsField.getMaximumSize().width, 35));

        calculateButton = new JButton("Calcular perímetro");
        calculateButton.setBackground(COLOR_BLACK);
        calculateButton.setForeground(COLOR_WHITE);
        calculateButton.setFocusable(false);

        inputPanel.add(radiusLabel);
        inputPanel.add(Box.createVerticalStrut(8));
        inputPanel.add(radiusField);
        inputPanel.add(Box.createVerticalStrut(16));
        inputPanel.add(subIntervalsLabel);
        inputPanel.add(Box.createVerticalStrut(8));
        inputPanel.add(subIntervalsField);
        inputPanel.add(Box.createVerticalStrut(16));
        inputPanel.add(calculateButton);

        return inputPanel;
    }

    private JPanel createOutputPanel() {
        JPanel outputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        outputPanel.setBackground(COLOR_WHITE);

        result = new JLabel("Resultado:");
        result.setForeground(COLOR_BLACK);
        result.setFont(new Font("Dialog", Font.BOLD, 14));

        outputPanel.add(result);

        return outputPanel;
    }

    private JPanel createImgPanel() {
        JPanel imgPanel = new JPanel();
        imgPanel.setBackground(COLOR_WHITE);
        imgPanel.setPreferredSize(new Dimension(200, imgPanel.getPreferredSize().height));

        JLabel imgLabel = new JLabel();
        try {
            ImageIcon img = new ImageIcon(getClass().getResource("/img/viviani.png"));
            imgLabel.setIcon(img);
        } catch (Exception e) {
            System.out.println("viviani.png no encontrada.");
        }

        imgPanel.add(imgLabel);

        return imgPanel;
    }

    public JTextField getRadiusField() {
        return radiusField;
    }

    public JTextField getSubIntervalsField() {
        return subIntervalsField;
    }

    public JButton getCalculateButton() {
        return calculateButton;
    }

    public JLabel getResult() {
        return result;
    }
}
