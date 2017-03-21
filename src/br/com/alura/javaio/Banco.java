package br.com.alura.javaio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {

    private List<Conta> contas = new ArrayList<>();
    private Map<String, Conta> mapContas = new HashMap<>();

    public void adiciona(Conta c) {
        contas.add(c);
        mapContas.put(c.getNome(), c);
    }

    public Conta pega(int posicao) {
        return contas.get(posicao);
    }

    public int getQuantidadeDeContas() {
        return contas.size();
    }

    public Conta buscaPorNome(String nome) {
        return mapContas.get(nome);
    }

}
