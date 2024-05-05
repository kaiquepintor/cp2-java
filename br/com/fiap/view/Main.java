package br.com.fiap.view;

import br.com.fiap.model.Cliente;
import br.com.fiap.model.ContaCorrente;
import br.com.fiap.model.ContaInvestimento;
import br.com.fiap.model.ContaPoupanca;
import javax.swing.*;

public class Main{
    public static void main(String[] args) {

        // Instanciando cliente
        Cliente cliente = new Cliente();

        // Cadastro do cliente
        cliente.registrarCliente();

        // Instanciando as contas
        ContaCorrente contaCorrente = new ContaCorrente(10);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2.5);
        ContaInvestimento contaInvestimento = new ContaInvestimento();

        // Apresentação do banco
        JOptionPane.showMessageDialog(null, "Bem vindo ao SCCP Bank!");

        int opcao;

        // Loop principal
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma conta para acessar: 1- Corrente | 2- Poupança | 3- Investimento | 4- Sair"));

            switch (opcao) {
                case 1:
                    // Operações da conta corrente
                    int opcaoCorrente;
                    do {
                        opcaoCorrente = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma operação: 1- Depósito | 2- Saque | 3- Saldo atual | 4- Voltar ao menu principal"));

                        switch (opcaoCorrente) {
                            case 1:
                                // Depósito
                                float adicionarValor = Float.parseFloat(JOptionPane.showInputDialog("Digite quanto deseja depositar: "));
                                contaCorrente.depositar(adicionarValor);
                                JOptionPane.showMessageDialog(null, "Será descontado R$10 reais pela taxa de manutenção mensal");
                                contaCorrente.aplicartaxaManutencao();
                                break;

                            case 2:
                                // Saque
                                float retirarValor = Float.parseFloat(JOptionPane.showInputDialog("Digite quanto deseja sacar: "));
                                contaCorrente.sacar(retirarValor);
                                break;

                            case 3:
                                // Saldo atual
                                JOptionPane.showMessageDialog(null, "Seu saldo atual é: " + contaCorrente.retornarSaldo());
                                break;

                            case 4:
                                // Voltar ao menu principal
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida! Por favor, escolha uma opção válida.");
                                break;
                        }
                    } while (opcaoCorrente != 4);
                    break;

                case 2:
                    // Operações da conta poupança
                    int opcaoPoupanca;
                    do {
                        opcaoPoupanca = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma operação: 1- Depósito | 2- Saque | 3- Saldo atual | 4- Calcula Juros | 5- Retirar Juros | 6- Voltar ao menu principal"));

                        switch (opcaoPoupanca) {
                            case 1:
                                // Depósito
                                float valorDeposito = Float.parseFloat(JOptionPane.showInputDialog("Digite aqui quanto deseja depositar:"));
                                contaPoupanca.depositar(valorDeposito);
                                JOptionPane.showMessageDialog(null, "Saldo atual: R$" + contaPoupanca.retornarSaldo());
                                break;

                            case 2:
                                // Saque
                                float valorSaque = Float.parseFloat(JOptionPane.showInputDialog("Digite aqui quanto deseja sacar:"));
                                contaPoupanca.sacar(valorSaque);
                                break;

                            case 3:
                                // Saldo atual
                                JOptionPane.showMessageDialog(null, "Seu saldo atual é: " + contaPoupanca.retornarSaldo());
                                break;

                            case 4:
                                // Calcular juros
                                contaPoupanca.calcularJuros();
                                break;

                            case 5:
                                // Retirar juros
                                contaPoupanca.retirarJuros();
                                break;

                            case 6:
                                // Voltar ao menu principal
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida! Por favor, escolha uma opção válida.");
                                break;
                        }
                    } while (opcaoPoupanca != 6);
                    break;

                case 3:
                    // Operações da conta investimento
                    int opcaoInvestimento;
                    do {
                        opcaoInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma operação: 1- Definir perfil de investidor | 2- Verificar perfil de investidor | 3- Voltar ao menu principal"));

                        switch (opcaoInvestimento) {
                            case 1:
                                // Difinir perfil investidor
                                String perfil;
                                do {
                                    perfil = JOptionPane.showInputDialog("Digite seu perfil de investidor (conservador, moderado, agressivo):");
                                    contaInvestimento.definirPerfilInvestidor(perfil);
                                } while (contaInvestimento.getPerfilInvestimento() == null);
                                JOptionPane.showMessageDialog(null, "Perfil de investidor definido com sucesso!");
                                break;

                            case 2:
                                // Verificar perfil investidor
                                JOptionPane.showMessageDialog(null, contaInvestimento.mostrarPerfil());

                            case 3:
                                // Voltar ao menu principal
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida! Por favor, escolha uma opção válida.");
                                break;
                        }
                    } while (opcaoInvestimento != 3);
                    break;

                case 4:
                    // Sair do programa
                    JOptionPane.showMessageDialog(null, "Obrigado por utilizar o SCCP Bank!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Por favor, escolha uma opção válida.");
                    break;
            }
        } while (opcao != 4);

    }
}
