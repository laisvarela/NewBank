package com.mycompany.classes;

public class Titular {
    private String nome;
    private String endereco;

    public Titular() {
    }

    public Titular(String nome, String end) {
        this.nome = nome;
        this.endereco = end;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }
    
}
