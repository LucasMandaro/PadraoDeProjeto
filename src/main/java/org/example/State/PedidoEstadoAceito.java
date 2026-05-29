package org.example.State;

public class PedidoEstadoAceito extends PedidoEstado{

    private PedidoEstadoAceito(){};

    private static PedidoEstadoAceito instance = new PedidoEstadoAceito();

    public static PedidoEstadoAceito getInstance(){
        return instance;
    }

    public String getEstado(){
        return "Aceito";
    }

    public boolean saiuParaEntrega(Pedido pedido){
        pedido.setEstado(PedidoEstadoSaiuParaEntrega.getInstance());
        return true;
    }

    public boolean cancelado(Pedido pedido){
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}
