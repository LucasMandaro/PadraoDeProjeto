package org.example.Abstractfactory;

public class Padaria {
    private Pao pao;
    private Torta torta;

    public Padaria (FabricaAbstrata fabrica){
        this.pao = fabrica.createPao();
        this.torta = fabrica.createTorta();
    }

    public String verificarPao(){
        return this.pao.verificar();
    }

    public String verificarTorta(){
        return this.torta.verificar();
    }
}
