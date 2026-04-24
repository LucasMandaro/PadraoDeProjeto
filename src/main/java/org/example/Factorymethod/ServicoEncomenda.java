package org.example.Factorymethod;

public class ServicoEncomenda implements PadariaIServico{

    public String executar(){
        return "Encomenda Realizada";
    }

    public String cancelar() {
        return "Encomenda Cancelada";
    }
}
