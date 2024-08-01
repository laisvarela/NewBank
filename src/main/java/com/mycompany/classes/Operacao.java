package com.mycompany.classes;

import java.time.LocalDateTime;

public class Operacao {
    private String descricao;
    private double valor;
    private LocalDateTime date;
    private Conta conta;

    public Operacao() {
    }

    public Operacao(String desc, double v, LocalDateTime data, Conta c) {
        this.descricao = desc;
        this.valor = v;
        this.date = data;
        this.conta = c;
    }
}
