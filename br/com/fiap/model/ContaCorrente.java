package br.com.fiap.model;

public class ContaCorrente extends ContaBancaria{

    // Atributos
    private double taxaManutencaoMensal;

    // Construtores
    public ContaCorrente(double saldo, double taxaManutencaoMensal) {
        super(saldo);
        this.taxaManutencaoMensal = taxaManutencaoMensal;
    }
    public ContaCorrente(double taxaManutencaoMensal) {
        this.taxaManutencaoMensal = taxaManutencaoMensal;
    }
    public ContaCorrente() {}

    // Getters e Setters
    public double getTaxaManutencaoMensal() {
        return taxaManutencaoMensal;
    }
    public void setTaxaManutencaoMensal(double taxaManutencaoMensal) {
        this.taxaManutencaoMensal = taxaManutencaoMensal;
    }

    // Método de aplicar taxa de manutenção
    public void aplicartaxaManutencao() {
        sacar(taxaManutencaoMensal);
    }

}
