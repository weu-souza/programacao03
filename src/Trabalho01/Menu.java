package Trabalho01;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
Conta c = new Conta();

void escolheOpcao(int opcao){
    if(opcao==1){
        System.out.println("qual valor você quer depositar?");
        c.deposita( sc.nextDouble());
    }
    if(opcao==2){
        System.out.println("digite o valor a ser sacado: ");

        c.sacar(sc.nextDouble());
    }
    if(opcao==3){
        System.out.println("escreva o numero da conta: ");

        System.out.println("digite o valor a ser enviado: ");

        c.transfere(sc.nextDouble());
    }

    }



    public void iniciar(){
        int opcao;
        System.out.println("digite seu nome: ");
        c.nome=sc.next();
        System.out.println("digite o numero da conta: ");
        c.numero=sc.nextInt();

        do {
            exibeMenu();
            System.out.println("saldo: "+c.saldo);
            opcao = sc.nextInt();
            escolheOpcao(opcao);


        } while (opcao != 4);
    }

    public void exibeMenu() {
        System.out.println("escolha uma opção!");
        System.out.println("1-depositar\n2-sacar\n3-transferir\n4-Sair");

    }
}
