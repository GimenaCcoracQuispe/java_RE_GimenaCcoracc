package vallegrande.edu.pe.controller;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import vallegrande.edu.pe.model.Calculadora;

public class VentanaCalculadora extends JFrame {
    JTextField txtNum1, txtNum2;
    JButton btnSumar, btnRestar;
    JLabel lblResultado;
    Calculadora calc = new Calculadora();

    public VentanaCalculadora() {
        setTitle("Calculadora");
        setSize(300, 200);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        txtNum1 = new JTextField();
        txtNum1.setBounds(30, 20, 100, 30);
        add(txtNum1);

        txtNum2 = new JTextField();
        txtNum2.setBounds(150, 20, 100, 30);
        add(txtNum2);

        btnSumar = new JButton("Sumar");
        btnSumar.setBounds(30, 70, 100, 30);
        add(btnSumar);

        btnRestar = new JButton("Restar");
        btnRestar.setBounds(150, 70, 100, 30);
        add(btnRestar);

        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(30, 120, 200, 30);
        add(lblResultado);

        btnSumar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(txtNum1.getText());
                double n2 = Double.parseDouble(txtNum2.getText());
                calc.setNumeros(n1, n2);
                lblResultado.setText("Resultado: " + calc.sumar());
            }
        });

        btnRestar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(txtNum1.getText());
                double n2 = Double.parseDouble(txtNum2.getText());
                calc.setNumeros(n1, n2);
                lblResultado.setText("Resultado: " + calc.restar());
            }
        });
    }

    public static void main(String[] args) {
        new VentanaCalculadora().setVisible(true);
    }
}
