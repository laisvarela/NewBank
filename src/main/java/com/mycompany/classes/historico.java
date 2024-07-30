package com.mycompany.classes;

import java.util.List;

public class historico {

    private Titular titular;
    private List<Operacao> operacoes;

    public historico() {
    }

    public boolean registrarOperacao(Titular t, Operacao o) {
        return true;
    }

    public Operacao pesquisarOperacao(Operacao o) {
        return o;
    }

    public List<Operacao> pesquisarValores(double valor) {
        return operacoes;
    }
}
