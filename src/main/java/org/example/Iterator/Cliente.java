package org.example.Iterator;

public class Cliente {
    private String nome;
    private boolean conta;

    public Cliente(String nome, boolean conta){
        this.nome = nome;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isConta(){
        return conta;
    }

    public void setConta(boolean conta){
        this.conta = conta;
    }
}
