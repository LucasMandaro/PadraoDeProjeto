package org.example.command;

public class Pao {
    private int quantidade;
    private String tamanho;
    private String  situacao;

    public Pao(int quantidade, String tamanho){
        this.quantidade = quantidade;
        this.tamanho =  tamanho;
    }

    public String getSituacao(){
        return situacao;
    }

    public void aceitarEncomenda(){
        this.situacao = "Encomenda aceita";
    }

    public void cancelarEncomenda(){
        this.situacao = "Encomenda cancelada";
    }
}
