package br.com.alura.javaio;

import java.util.HashSet;

public class TestaHashSetDeConta {

    public static void main(String[] args) {
        HashSet<Conta> contas = new HashSet<Conta>();

        ContaCorrente c1 = new ContaCorrente(123, "Mauricio");
        ContaCorrente c2 = new ContaCorrente(123, "Adriano");
        ContaCorrente c3 = new ContaCorrente(444, "Luiz");

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        System.out.println("Total de contas no HashSet: " + contas.size());
    }

}
