package com.mycompany.classes;

public class Poupanca extends Conta{
    private double taxa;

    public Poupanca(int numero, Titular titular, double taxa) {
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    @Override
    public boolean sacar(double valor) {
        return true;
    }
    
    public boolean pagarOnline(double valor) {
        return true;
    }
    
}
