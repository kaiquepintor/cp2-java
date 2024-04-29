import br.com.fiap.model.ContaBancaria;
import br.com.fiap.model.ContaCorrente;
import br.com.fiap.model.ContaInvestimento;
import br.com.fiap.model.ContaPoupanca;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Contas
        ContaCorrente contaCorrente = new ContaCorrente(10);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2.5);
        ContaInvestimento contaInvestimento = new ContaInvestimento();

        //Apresentação do banco
        JOptionPane.showMessageDialog(null, "Bem vindo ao SCCP Bank!");

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma conta para acessar: 1-Corrente 2-Poupança 3-Investimento"));
        switch (opcao) {
            case 1:

                //Deposito
                float adicionarValor = Float.parseFloat(JOptionPane.showInputDialog("Digite aqui quanto deseja depositar:"));
                contaCorrente.depositar(adicionarValor);
                JOptionPane.showMessageDialog(null, "Será descontado R$10 de sua conta pela taxa de manutenção mensal");
                contaCorrente.aplicartaxaManutencao(); //aplicação da taxa

                //Saque
                float retirarValor = Float.parseFloat(JOptionPane.showInputDialog("Digite aqui quanto deseja retirar: "));
                contaCorrente.sacar(retirarValor);
                break;

            case 2:
                float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite aqui quanto deseja depositar:"));
                contaPoupanca.depositar(valor);
                contaPoupanca.calcularJuros();
                break;

            case 3:

        }

    }
}
