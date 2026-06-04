package org.example.Mediator;

public class Cozinha {
    private static Cozinha instancia = new Cozinha();

    private Cozinha(){}

    public static Cozinha getInstancia() {
        return instancia;
    }

    public String produzir(String item){
        return "Iremos produzir a sua encomenda de: \n" + item + "\n Obrigado pela preferencia";
    }
}
