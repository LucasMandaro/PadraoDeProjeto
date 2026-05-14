package org.example.Templatemethod;

public class PaoDoce extends Forno{

    public PaoDoce(int temperaturaAtual){
        super(temperaturaAtual);
    }

    protected boolean isTemperaturaIdeal(){
        return getTemperaturaAtual() >= 180 && getTemperaturaAtual() <= 200;
    }
}
