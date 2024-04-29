package br.com.fiap.model;

import javax.swing.*;

public class ContaBancaria {

    //atributos
    private String idConta;
    protected double saldo;

    //construtores
    public ContaBancaria(String idConta, double saldo) {
        this.idConta = idConta;
        this.saldo = saldo;
    }
    public ContaBancaria() {}

    //getters e setters
    public String getIdConta() {
        return idConta;
    }
    public void setIdConta(String idConta) {
        this.idConta = idConta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //método de deposito
    public void depositar(double valor) {
        saldo += valor;
    }

    //método de sacar
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            JOptionPane.showMessageDialog(null, "Saldo atual: R$" + retornarSaldo());
        } else JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
    }

    //método de retornar saldo
    public double retornarSaldo () {
        return saldo;
    }

}
