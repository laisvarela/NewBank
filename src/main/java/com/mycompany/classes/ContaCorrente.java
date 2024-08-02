package com.mycompany.classes;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(int numero, Titular titular) {
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        return getSaldo() - valor >= -limite;
    }

    public boolean pagarOnline(double valor) {
        return true;
    }
}
