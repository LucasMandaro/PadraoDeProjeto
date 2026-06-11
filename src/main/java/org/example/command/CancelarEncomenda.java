package org.example.command;

public class CancelarEncomenda implements Encomenda{

    private Pao pao;

    public CancelarEncomenda(Pao pao){
        this.pao = pao;
    }

    @Override
    public void executar() {
        this.pao.cancelarEncomenda();
    }

    @Override
    public void cancelar() {
        this.pao.aceitarEncomenda();
    }
}
