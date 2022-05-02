package poo4;

public class PessoaFisica extends Pessoa {
    private long cpf;
    private double imposto = 0.1;


    public PessoaFisica(String[] contatos) {
        super(contatos);
    }

    public PessoaFisica(String nome, String endereco, double valorPagamento, long cpf) {
        super(nome, endereco, valorPagamento);
        this.cpf = cpf;

    }

    private double calcularImposto() {
        return getValorPagamento() * this.imposto;
    }

    @Override
    public double realizarPagamentos() {
        return getValorPagamento() - calcularImposto();
    }
}
