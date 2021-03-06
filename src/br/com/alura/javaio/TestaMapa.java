package br.com.alura.javaio;

import java.util.HashMap;
import java.util.Map;

public class TestaMapa {

    public static void main(String[] args) {
        Conta c1 = new ContaCorrente(123, "Gustavo");
        c1.deposita(10000);

        Conta c2 = new ContaCorrente(321, "Maria");
        c2.deposita(3000);

        // cria o mapa
        Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();

        // adiciona duas chaves e seus valores
        mapaDeContas.put("diretor", c1);
        mapaDeContas.put("gerente", c2);

        // qual a conta do diretor?
        Conta contaDoDiretor = mapaDeContas.get("diretor");
        System.out.println(contaDoDiretor.getValor());
    }

}
