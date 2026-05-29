package org.example.State;

public class PedidoEstadoPendente extends PedidoEstado{

    private PedidoEstadoPendente() {};
    private static PedidoEstadoPendente instance = new PedidoEstadoPendente();
    public static PedidoEstadoPendente getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Pendendete";
    }

    public boolean aceito(Pedido pedido) {
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        return true;
    }

    public boolean cancelado(Pedido pedido){
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}
