package br.com.alura.javaio;

public class Conta implements Comparable<ContaPoupanca> {
    // outros atributos

    protected int numero;
    protected String nome;
    protected double valor;

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void deposita(double valor) {
        this.valor += valor;
    }

    @Override
    public int compareTo(ContaPoupanca outra) {
        return this.getNumero() - outra.getNumero();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numero;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Conta other = (Conta) obj;
        if (numero != other.numero) {
            return false;
        }
        return true;
    }

}
