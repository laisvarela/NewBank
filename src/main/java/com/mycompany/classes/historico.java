package com.mycompany.classes;

import java.util.List;

public class historico {

    private Titular titular;
    private List<Operacao> operacoes;

    public historico() {
    }

    public boolean registrarOperacao(Titular t, Operacao o) {
        if (this.titular.equals(t)) {
            operacoes.add(o);
            return true;
        } else {
            return false;
        }
    }

    public Operacao pesquisarOperacao(Operacao o) {
        for (Operacao operacao : operacoes) {
            if (operacao.equals(o)) {
                return operacao;
            }
        }
        return null;
    }

    public List<Operacao> pesquisarValores(double valor) {
        return null;
    }

    public void gerarExtratoPDF(String filePath) {
    }
}
