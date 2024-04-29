package br.com.fiap.model;

public class ContaCorrente extends ContaBancaria{

    //atributos
    private double taxaManutencaoMensal;

    //construtores
    public ContaCorrente(String idConta, double saldo, double taxaManutencaoMensal) {
        super(idConta, saldo);
        this.taxaManutencaoMensal = taxaManutencaoMensal;
    }
    public ContaCorrente(double taxaManutencaoMensal) {
        this.taxaManutencaoMensal = taxaManutencaoMensal;
    }
    public ContaCorrente() {}

    //getters e setters
    public double getTaxaManutencaoMensal() {
        return taxaManutencaoMensal;
    }
    public void setTaxaManutencaoMensal(double taxaManutencaoMensal) {
        this.taxaManutencaoMensal = taxaManutencaoMensal;
    }

    //método de aplicar taxa de manutenção
    public void aplicartaxaManutencao() {
        sacar(taxaManutencaoMensal);
    }

}
