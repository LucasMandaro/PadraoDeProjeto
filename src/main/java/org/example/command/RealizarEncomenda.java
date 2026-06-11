package org.example.command;

public class RealizarEncomenda implements Encomenda{

    private Pao pao;

    public RealizarEncomenda(Pao pao){
        this.pao = pao;
    }

    @Override
    public void executar() {
        this.pao.aceitarEncomenda();
    }

    @Override
    public void cancelar() {
        this.pao.cancelarEncomenda();
    }
}
