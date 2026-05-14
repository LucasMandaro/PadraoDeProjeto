package org.example.Templatemethod;

public class PaoDeSal extends Forno{

    public PaoDeSal(int temperaturaAtual) {
        super(temperaturaAtual);
    }

    protected boolean isTemperaturaIdeal(){
        return getTemperaturaAtual() >= 200 && getTemperaturaAtual() <= 250;
    }


}
