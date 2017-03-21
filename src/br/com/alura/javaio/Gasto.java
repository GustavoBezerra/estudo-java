package br.com.alura.javaio;

import java.util.Calendar;

public class Gasto {

    private double valor;
    private String tipo;
    private Funcionario funcionario;
    private Calendar dataDespesa;

    public Gasto(double valor, String tipo, Funcionario funcionario, Calendar dataDespesa) {
        this.valor = valor;
        this.tipo = tipo;
        this.funcionario = funcionario;
        this.dataDespesa = dataDespesa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Calendar getDataDespesa() {
        return dataDespesa;
    }

    public void setDataDespesa(Calendar dataDespesa) {
        this.dataDespesa = dataDespesa;
    }

}
