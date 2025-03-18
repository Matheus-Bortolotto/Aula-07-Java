package org.example;

public class ContaBancaria {
    private double saldo;
    private String titular;

    //Construtor
    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo= 0.0;
    }

    //Getter para saldo
    public double getSaldo(){
        return saldo;
    }

    //Getter s Setter para titular
    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        if (titular != null && !titular.trim().isEmpty()){
            this.titular = titular;
        }
    }

    //Método para depositar
    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        }
    }

    //Método para sacar
    public boolean sacar(double valor){
        if (valor > 0 && valor <= saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}
