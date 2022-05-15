package poo5;


import javax.swing.*;

public class Conta {
    private int numero;
    private double saldo;
    private double limite;
    private String nome;


    public void deposita(double valor) {
        this.saldo += valor;
        JOptionPane.showMessageDialog(null, "Depositando: " + valor + "R$ clique em ok para finalizar!");

    }


    public void saca(Double valor) {
        if (saldo < (saldo + limite)) {
            saldo -= valor;
            limite = 0;
            JOptionPane.showMessageDialog(null, "Sacado: " + valor + "R$ clique em ok para finalizar!");
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente. Faça um depósito\n");
        }


    }


    public void transfere(Conta destino, double valor) {

        destino.deposita(valor);
    }

    public void criarConta() {
        numero = (Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta: ")));
        saldo = (Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial: ")));
        limite = (Double.parseDouble(JOptionPane.showInputDialog("Digite o limite: ")));
        nome = (JOptionPane.showInputDialog("Digite o nome do Titular: "));

        JOptionPane.showMessageDialog(null, "Nova conta criada com sucesso!");

    }

    public void mostrarSaldo() {
        JOptionPane.showMessageDialog(null, saldo);
    }

    public void pesquisarNumConta() {
        JOptionPane.showMessageDialog(null, numero);
    }

    public void mostrarDadosConta() {
        JOptionPane.showMessageDialog(null, "numero da conta: " + numero + "\n" + "Saldo: " + saldo + "\n" + "Nome: " + nome + "\n" + "Limite: " + limite);

    }

}






