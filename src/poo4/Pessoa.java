package poo4;

public abstract class Pessoa {
    private String nome;
    private String endereco;
    private double valorPagamento;
    private String[] contatos;

    public Pessoa(String[] contatos) {
        setContatos(contatos);
    }

    public Pessoa(String nome, String endereco, double valorPagamento) {
        this.nome = nome;
        this.endereco = endereco;
        this.valorPagamento = valorPagamento;

    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        if (valorPagamento > 0)
            this.valorPagamento = valorPagamento;
        else {
            this.valorPagamento = 0;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String[] getContatos() {
        return contatos;
    }

    public void setContatos(String[] contatos) {
        this.contatos = contatos;
    }

    public abstract double realizarPagamentos();

}