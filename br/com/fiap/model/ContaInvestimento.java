package br.com.fiap.model;

public class ContaInvestimento extends ContaBancaria{

    //atributos
    private String perfilInvestimento;

    //construtores
    public ContaInvestimento(String idConta, double saldo, String perfilInvestimento) {
        super(idConta, saldo);
        this.perfilInvestimento = perfilInvestimento;
    }
    public ContaInvestimento(String perfilInvestimento) {
        this.perfilInvestimento = perfilInvestimento;
    }
    public ContaInvestimento() {}

    //getters e setters
    public String getPerfilInvestimento() {
        return perfilInvestimento;
    }
    public void setPerfilInvestimento(String perfilInvestimento) {
        this.perfilInvestimento = perfilInvestimento;
    }
}
