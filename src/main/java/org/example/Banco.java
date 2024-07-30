package org.example;

import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome, List<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void exibirClientes(){
        for(Conta c : contas){
            System.out.println("Cliente: " + c.getCliente().getNome());
        }
    }

    public void exibirSaldoTotalBanco(){
        double saldoTotal = 0;
        for(Conta c: contas){
            saldoTotal += c.getSaldo();
        }
        System.out.println("Saldo total no banco: " + saldoTotal);
    }
}
