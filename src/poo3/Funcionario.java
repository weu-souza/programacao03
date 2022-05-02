package poo3;


public class Funcionario {
    public String nomeFuncionario;
    public String departamentoTrabalha;
    public double salario;
     public Data dataDeEntradaBanco;
    public String rg;
    public boolean estaNaEmpresa;




    double salario() {
        if (demite()) {
            return salario;
        } else
            return 0;
    }


    boolean demite() {

        return this.estaNaEmpresa;

    }

    double bonificacao(double aumento) {
        if (demite()) {
            return salario * aumento;

        } else {
            return 0;
        }

    }


    void mostrarFuncionario() {
        System.out.println("nome do funcionario: " + this.nomeFuncionario);
        System.out.println("departamento em que trabalha: " + this.departamentoTrabalha);
        System.out.println("rg: " + this.rg);
        System.out.println("salario: " + this.salario());
        System.out.println("bonificacão: " + this.bonificacao(0.15));
    }

}
