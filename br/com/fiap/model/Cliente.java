package br.com.fiap.model;

import javax.swing.*;

public class Cliente {

    // Atributos
    private String cpf;
    private String nome;
    private String email;

    // Construtores
    public Cliente(String cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }
    public Cliente() {}

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Método para cadastro do cliente
    public void registrarCliente () {
        String cpf = JOptionPane.showInputDialog("Digite seu CPF:");
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String email = JOptionPane.showInputDialog("Digite seu email:");
    }

}


