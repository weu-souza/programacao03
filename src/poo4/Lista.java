package poo4;

import java.util.Arrays;

public class Lista {
    public void dadosPessoa() {
        PessoaFisica pf = new PessoaFisica("larissa", "r25 quadra 9,parque 2", 2500, 00000000000);
        PessoaJuridica pj = new PessoaJuridica("joao", "r42 q 5 parque norte", 1600, 00000000000000, "bebida", "bebida  Indústrias Ltda");
        PessoaFisica contatos1 = new PessoaFisica(new String[]{"joao", "maria", "jose"});
        PessoaJuridica contatos2 = new PessoaJuridica(new String[]{"cocacola", "antartica", "brahma"});
        System.out.println("Pessoa Fisica");
        System.out.println("nome: " + pf.getNome() + "\nendereço: " + pf.getEndereco() + "\npagamento: " + pf.realizarPagamentos() + "\ncontatos: " + Arrays.toString(contatos1.getContatos()));
        System.out.println("\nPessoa Juridica");
        System.out.println("nome: " + pj.getNome() + "\nendereço: " + pj.getEndereco() + "\npagamento: " + pj.realizarPagamentos() + "\ncontatos: " + Arrays.toString(contatos2.getContatos()));
    }
}
