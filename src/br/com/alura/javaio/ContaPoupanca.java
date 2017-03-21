package br.com.alura.javaio;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Conta poupança\n"
                + "Numero: " + numero + "\n"
                + "Nome: " + nome + "\n"
                + "Valor: " + valor + "\n"
                + "-----------------------------";
    }
}
