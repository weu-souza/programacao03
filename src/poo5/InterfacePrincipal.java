package poo5;


import javax.swing.*;


public class InterfacePrincipal extends JFrame {
    private JComboBox comboBox1;
    private JButton okButton;
    private JButton sairButton;
    private JPanel painel;
    private int escolha = 0;
    Conta conta = new Conta();
    Conta conta1 = new Conta();

    private void Objconta(int obj) {
        switch (obj) {
            case 0:
                try {
                    conta.criarConta();
                } catch (IllegalArgumentException exception) {
                    JOptionPane.showMessageDialog(null, "Digite apenas numero!");


                }


                break;
            case 1:
                conta.mostrarSaldo();

                break;
            case 2:
                conta.pesquisarNumConta();

                break;
            case 3:
                conta.mostrarDadosConta();
                break;
            case 4:
                try {
                    conta.saca(Double.parseDouble(JOptionPane.showInputDialog("digite a quantidade a sacar: ")));
                } catch (IllegalArgumentException exception) {
                    JOptionPane.showMessageDialog(null, "Digite apenas numero!");

                }

                break;
            case 5:
                try {
                    conta.deposita(Double.parseDouble(JOptionPane.showInputDialog("informe a quantidade que vai depositar: ")));
                } catch (IllegalArgumentException exception) {
                    JOptionPane.showMessageDialog(null, "Digite apenas numero!");
                }
                break;
            case 6:
                try {
                    conta.transfere(conta1, Double.parseDouble(JOptionPane.showInputDialog("o valor")));
                } catch (IllegalArgumentException exception) {
                    JOptionPane.showMessageDialog(null, "Digite apenas numero!");
                }


                break;
        }
    }

    private void ObjConta1(int obj) {
        switch (obj) {
            case 0:
                try {
                    conta1.criarConta();
                } catch (IllegalArgumentException exception) {
                    JOptionPane.showMessageDialog(null, "Digite apenas numero!");


                }


                break;
            case 1:
                conta1.mostrarSaldo();

                break;
            case 2:
                conta1.pesquisarNumConta();

                break;
            case 3:
                conta1.mostrarDadosConta();
                break;
            case 4:
                try {
                    conta1.saca(Double.parseDouble(JOptionPane.showInputDialog("digite a quantidade a sacar: ")));
                } catch (IllegalArgumentException exception) {
                    JOptionPane.showMessageDialog(null, "Digite apenas numero!");

                }

                break;
            case 5:
                try {
                    conta1.deposita(Double.parseDouble(JOptionPane.showInputDialog("informe a quantidade que vai depositar: ")));
                } catch (IllegalArgumentException exception) {
                    JOptionPane.showMessageDialog(null, "Digite apenas numero!");
                }
                break;
            case 6:
                try {
                    conta1.transfere(conta, Double.parseDouble(JOptionPane.showInputDialog("o valor")));
                } catch (IllegalArgumentException exception) {
                    JOptionPane.showMessageDialog(null, "Digite apenas numero!");
                }


                break;
        }
    }


    InterfacePrincipal() {
        this.setContentPane(painel);
        this.setSize(500, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


        okButton.addActionListener(e -> {
            try {
                escolha = Integer.parseInt(JOptionPane.showInputDialog("escolha entre uma das contas \n1\n2"));


            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "Digite apenas numero!");
//                    deixei assim porque tinha parte onde ele printava o dado mesmo digitando letra, quando eu aprender melhor eu arrumo.
            throw exception;
            }
            switch (escolha) {
                case 1:
                    Objconta(comboBox1.getSelectedIndex());
                    break;
                case 2:
                    ObjConta1(comboBox1.getSelectedIndex());
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Não e um numero valido!");
            }


        });
        sairButton.addActionListener(e -> dispose());
    }


}



















