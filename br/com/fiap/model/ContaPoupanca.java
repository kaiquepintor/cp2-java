package br.com.fiap.model;

import javax.swing.*;

public class ContaPoupanca extends ContaBancaria{

    //atributos
    private double taxaJuros;

    //construtores
    public ContaPoupanca(String idConta, double saldo, double taxaJuros) {
        super(idConta, saldo);
        this.taxaJuros = taxaJuros;
    }
    public ContaPoupanca(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    public ContaPoupanca() {}

    //getters e setters
    public double getTaxaJuros() {
        return taxaJuros;
    }
    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    //método para calcular taxa de juros
    public void calcularJuros() {
        double juros = saldo * (taxaJuros/100);
        depositar(juros);
        JOptionPane.showMessageDialog(null, "Juros de $" + juros + " foram adicionados ao saldo.");
    }
}
