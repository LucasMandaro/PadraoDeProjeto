package org.example.Prototype;

public class Padaria implements Cloneable{
    private String nome;
    private Endereco endereco;

    public Padaria(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public Padaria clone() throws CloneNotSupportedException {
        Padaria padariaClone = (Padaria) super.clone();
        padariaClone.endereco = (Endereco) padariaClone.endereco.clone();
        return padariaClone;
    }

    @Override
    public String toString() {
        return "Padaria{" + "nome=" + nome + ", endereco=" + endereco + '}';
    }
}
