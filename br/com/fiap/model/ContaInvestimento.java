package br.com.fiap.model;

import javax.swing.*;

public class ContaInvestimento extends ContaBancaria{

    // Atributos
    private String perfilInvestimento;

    // Construtores
    public ContaInvestimento(double saldo, String perfilInvestimento) {
        super(saldo);
        this.perfilInvestimento = perfilInvestimento;
    }
    public ContaInvestimento(String perfilInvestimento) {
        this.perfilInvestimento = perfilInvestimento;
    }
    public ContaInvestimento() {}

    // Getters e Setters
    public String getPerfilInvestimento() {
        return perfilInvestimento;
    }
    public void setPerfilInvestimento(String perfilInvestimento) {
        this.perfilInvestimento = perfilInvestimento;
    }

    // Método de verificar se o perfil de investidor é válido
    public void definirPerfilInvestidor(String perfil) {
        if (perfil.equalsIgnoreCase("conservador") || perfil.equalsIgnoreCase("moderado") || perfil.equalsIgnoreCase("agressivo")) {
            this.perfilInvestimento = perfil;
        } else {
            JOptionPane.showMessageDialog(null, "Perfil de investidor não existente. Por favor, escolha entre conservador, moderado ou agressivo.");
        }
    }

    // Método para mostrar perfil de investidor
    public String mostrarPerfil () {
        if (perfilInvestimento == null) {
            return "Você ainda não tem um perfil de investidor definido.";
        } else {
            return "Perfil definido como: " + perfilInvestimento;
        }
    }
}
