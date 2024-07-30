package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        Cliente cliente1 = new Cliente("Joao");
        Cliente cliente2 = new Cliente("Maria");
        Cliente cliente3 = new Cliente("Jose");
        ContaCorrente cc = new ContaCorrente(cliente1);
        ContaPoupanca poupanca = new ContaPoupanca(cliente2);
        ContaPoupanca poupanca2 = new ContaPoupanca(cliente3);
        Banco banco = new Banco("Banco 1", contas);


        cc.depositar(100);
        cc.imprimirConta();
        poupanca.imprimirConta();

        cc.transferir(60, poupanca);
        cc.imprimirConta();
        poupanca.imprimirConta();
        poupanca.depositar(2500);
        poupanca2.depositar(3000);


        contas.add(cc);
        contas.add(poupanca);
        contas.add(poupanca2);
        banco.exibirClientes();
        banco.exibirSaldoTotalBanco();

    }
}