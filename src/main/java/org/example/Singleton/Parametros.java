package org.example.Singleton;

public class Parametros {

    private Parametros() {};

    private static Parametros instance = new Parametros();

    public static Parametros getInstance(){
        return instance;
    }

    private String nomePadaria;
    private String FunciomarioLogado;

    public String getNomePadaria() {
        return nomePadaria;
    }

    public void setNomePadaria(String nomePadaria) {
        this.nomePadaria = nomePadaria;
    }

    public String getFunciomarioLogado() {
        return FunciomarioLogado;
    }

    public void setFunciomarioLogado(String funciomarioLogado) {
        FunciomarioLogado = funciomarioLogado;
    }
}
