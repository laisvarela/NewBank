package com.mycompany.classes;

public class Conta {
    private int numero;
    private double saldo;
    private Titular titular;

    public void Conta(int numero, Titular titular) {
        this.numero = numero;
        this.titular = titular;
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
        return true;
    }
    public boolean depositar (double valor){
        return true;
    }
}   
