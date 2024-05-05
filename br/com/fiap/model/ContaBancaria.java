package br.com.fiap.model;

import javax.swing.*;

public class ContaBancaria {

    // Atributos
    protected double saldo;

    // Construtores
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }
    public ContaBancaria() {}

    // Getters e Setters
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método de deposito
    public void depositar(double valor) {
        saldo += valor;
    }

    // Método de saque
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            JOptionPane.showMessageDialog(null, "Saldo atual: R$" + retornarSaldo());
        } else JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
    }

    // Método de retornar saldo
    public double retornarSaldo () {
        return saldo;
    }

}
