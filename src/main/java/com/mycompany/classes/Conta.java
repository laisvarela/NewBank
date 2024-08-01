package com.mycompany.classes;

public class Conta {
    private int numero;
    private double saldo;
    private Titular titular;

    public void Conta(int numero, Titular titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Conta() {
    }

    public double getSaldo() {
        return saldo;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Titular getTitular() {
        return titular;
    }
    
    public boolean sacar (double valor){
        if(valor>0)
            return true;
        return false;
    }
    public boolean depositar (double valor){
        if(valor>0)
            return true;
        return false;
    }
}   
