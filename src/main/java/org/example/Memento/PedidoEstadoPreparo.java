package org.example.Memento;

public class PedidoEstadoPreparo implements PedidoEstado{
    private PedidoEstadoPreparo(){};
    private static PedidoEstadoPreparo instance = new PedidoEstadoPreparo();
    public static PedidoEstadoPreparo getInstance(){
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Preparo";
    }
}
