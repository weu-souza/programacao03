package Trabalho01;



public class Conta {
public int numero;
public double saldo;
public double limite;
public String nome;
void dadosConta(){
    this.limite=500;
    this.nome="bernardo";
}
    public void deposita(double valor){
        this.saldo+=valor;

    }
public boolean saca(double valor){
if(valor>this.saldo)
    return false;

else
    return true;
    }
    void sacar(double valor){

        if (!saca(valor)){
            System.out.println("saldo insuficiente!");
        }
        else {
            System.out.println("sacando...");
            this.saldo-=valor;
        }
    }


    public void transfere( double valor){

        saldo+=valor;



    }















    }

