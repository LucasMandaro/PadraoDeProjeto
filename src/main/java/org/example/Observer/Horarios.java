package org.example.Observer;

import java.util.Observable;

public class Horarios extends Observable {
    private String turno;
    private String mensagem;
    private String horario;

    public Horarios(String turno, String mensagem, String horario) {
        this.turno = turno;
        this.mensagem = mensagem;
        this.horario = horario;
    }

    public void informar(){
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Turno{ " + turno +
                ", horario=" + horario +
                ", mensagem=" + mensagem +
                " }";
    }
}
