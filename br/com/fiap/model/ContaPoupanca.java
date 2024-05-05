package br.com.fiap.model;

import javax.swing.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContaPoupanca extends ContaBancaria {

    // Atributos
    private double taxaJuros;
    private LocalDate dataUltimaMovimentacao;

    // Construtores
    public ContaPoupanca(double saldo, double taxaJuros, LocalDate dataUltimaMovimentacao) {
        super(saldo);
        this.taxaJuros = taxaJuros;
        this.dataUltimaMovimentacao = dataUltimaMovimentacao;
    }
    public ContaPoupanca(double taxaJuros) {
        this.taxaJuros = taxaJuros;
        this.dataUltimaMovimentacao = LocalDate.now(); // Define a data de abertura da conta como a data de hoje
    }
    public ContaPoupanca () {}

    // Getters e Setters
    public double getTaxaJuros() {
        return taxaJuros;
    }
    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public LocalDate getDataUltimaMovimentacao() {
        return dataUltimaMovimentacao;
    }
    public void setDataUltimaMovimentacao(LocalDate dataUltimaMovimentacao) {
        this.dataUltimaMovimentacao = dataUltimaMovimentacao;
    }

    // Método para calcular juros
    public void calcularJuros() {
        LocalDate dataAtual = LocalDate.now();
        long meses = ChronoUnit.MONTHS.between(dataUltimaMovimentacao, dataAtual);

        if (meses > 0) {
            double saldoAtual = getSaldo();
            double juros = saldoAtual * (taxaJuros / 100) * meses;
            depositar(juros);
            JOptionPane.showMessageDialog(null, "Juros calculados e adicionados à conta: " + juros);
            atualizarDataUltimaMovimentacao();
        } else {
            JOptionPane.showMessageDialog(null, "Não houve juros a serem calculados.");
        }
    }

    // Método para retirar juros
    public void retirarJuros() {
        double juros = getSaldo() * (taxaJuros / 100);
        if (juros > 0) {
            sacar(juros);
            JOptionPane.showMessageDialog(null, "Juros retirados: " + juros);
        } else {
            JOptionPane.showMessageDialog(null, "Não há juros a serem retirados.");
        }
    }

    // Método para atualizar ultima movimentação
    private void atualizarDataUltimaMovimentacao() {
        this.dataUltimaMovimentacao = LocalDate.now();
    }
}
