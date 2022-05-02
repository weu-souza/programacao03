package poo5;


import javax.swing.*;
import java.awt.event.*;

public class  InterfacePrincipal extends JFrame {
    private JComboBox comboBox1;
    private JButton okButton;
    private JButton sairButton;
    private JPanel painel;




    InterfacePrincipal() {
        this.setContentPane(painel);
        this.setSize(500,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

Conta conta = new Conta();

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

        switch (comboBox1.getSelectedIndex()){
            case 0:
                conta.criarConta();
                break;
            case 1:
                conta.mostrarSaldo();
                break;
            case 2:
                conta.mostrarNumConta();
                break;
            case 3:
                conta.mostrarDadosConta();
                break;
            case 4:
                conta.saca(Double.parseDouble(JOptionPane.showInputDialog("digite a quantidade a sacar: ")));
                break;
            case 5:
                conta.deposita(Double.parseDouble(JOptionPane.showInputDialog("informe a quantidade que vai depositar: ")));
                break;
            case 6:
                conta.transfere(Double.parseDouble(JOptionPane.showInputDialog("o valor")));
                break;
        }




            }
        });
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }


}



















