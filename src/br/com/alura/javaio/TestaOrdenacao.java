package br.com.alura.javaio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestaOrdenacao {

    public static void main(String[] args) {
        List<ContaPoupanca> contas = new LinkedList<>();

        ContaPoupanca c;
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            c = new ContaPoupanca(random.nextInt(999), "Teste " + i);
            c.deposita(i * 10);
            contas.add(c);
        }

        Collections.sort(contas);
//		Collections.shuffle(contas);

        for (ContaPoupanca conta : contas) {
            System.out.println(conta);
        }
    }

}
