package org.example.Observer;

import java.util.Observable;
import java.util.Observer;

public class Funcionario implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Funcionario(String nome){
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }

    public void matricularHorario(Horarios horarios){
        horarios.addObserver(this);
    }

    public void update(Observable horario, Object arg1) {
        this.ultimaNotificacao = this.nome + ", Aviso a todos do horario da " + horario.toString();
    }

}
