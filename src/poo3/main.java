package poo3;

public class main {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();
        Funcionario f2 = f1;
        Data d1 = new Data();
        d1.dia=1;
        d1.mes=12;
        d1.ano=2070;
        f1.dataDeEntradaBanco = d1;
        f1.nomeFuncionario="carlos";
        f1.departamentoTrabalha="administração";
        f1.salario=4600;
        f1.rg="00556";
        f1.estaNaEmpresa=true;

        System.out.println("Funcionario 1--------------------------------");
        f1.mostrarFuncionario();
        d1.mostrarData();
        System.out.println("---------------------------------------------\n");
        System.out.println("Funcionario 2:-------------------------------");
        f2.mostrarFuncionario();
        System.out.println("---------------------------------------------");
//se colocarmos os mesmos dados pra f1 e f2, o if sai como diferentes, mas se colocarmos, mesmo printando os dois, mas se colocar que o
// f2=f1, alem de printar os mesmos dados o if sai como iguais. Logo mesmo f1 e f2 possuindo os mesmos dados, o if mostra que são objetos diferentes.
        if (f1 == f2) {
            System.out.println("iguais!");
        } else {
            System.out.println("diferentes!");
        }


    }
}
