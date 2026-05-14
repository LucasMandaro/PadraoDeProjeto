package org.example.Templatemethod;

public abstract class Forno {
    private int temperaturaAtual;

    public Forno(int temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public String verificarTemperatura(){
        if (isTemperaturaIdeal()){
            return "Temperatura ideal";
        }
        return "Temperatura inadequada";
    }

    protected int getTemperaturaAtual(){
        return temperaturaAtual;
    }

    protected abstract boolean isTemperaturaIdeal();
}
