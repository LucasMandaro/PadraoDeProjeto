package org.example.command;

import java.util.ArrayList;
import java.util.List;

public class Padaria {

    private List<Encomenda> encomendas = new ArrayList<Encomenda>();

    public void executarTarefa(Encomenda encomenda){
        this.encomendas.add(encomenda);
        encomenda.executar();
    }

    public void cancelarUltimaEncomenda(){
        if (encomendas.size() != 0){
            Encomenda encomenda = this.encomendas.get(this.encomendas.size() - 1);
            encomenda.cancelar();
            this.encomendas.remove(this.encomendas.size() - 1);
        }
    }
}
