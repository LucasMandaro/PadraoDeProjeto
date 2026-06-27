package org.example.Flyweight;

public class Padaria {

    private String nome;
    private Cidade cidade;

    public Padaria(String nome, Cidade cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public String obterPadaria() {
        return "Padaria{ "+
                "nome= '" + this.nome + '\'' +
                ", cidade= '" + cidade.getNome() + "\'" +
                ", uf= '" + cidade.getUf() + "\'" +
                '}';
    }
}
