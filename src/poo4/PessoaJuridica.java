package poo4;

public class PessoaJuridica extends Pessoa {
    private int cnpj;
    private String nomeFantasia;
    private String razaoSocial;
    private double imposto = 0.2;


    public PessoaJuridica(String nome, String endereco, double valorPagamento, int cnpj, String nomeFantasia, String razaoSocial) {
        super(nome, endereco, valorPagamento);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;

    }

    public PessoaJuridica(String[] contatos) {
        super(contatos);
    }

    private double calcularImposto() {
        return getValorPagamento() * this.imposto;
    }

    @Override
    public double realizarPagamentos() {
        return getValorPagamento() - this.imposto;
    }
}
