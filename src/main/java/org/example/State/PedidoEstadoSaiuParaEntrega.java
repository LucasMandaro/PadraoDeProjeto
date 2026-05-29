package org.example.State;

public class PedidoEstadoSaiuParaEntrega extends PedidoEstado{

    private PedidoEstadoSaiuParaEntrega(){};

    private static PedidoEstadoSaiuParaEntrega instance = new PedidoEstadoSaiuParaEntrega();

    public static PedidoEstadoSaiuParaEntrega getInstance(){
        return instance;
    }

    public String getEstado(){
        return "Saiu para Entrega";
    }

    public boolean entregue(Pedido pedido){
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        return true;
    }

    public boolean cancelado(Pedido pedido){
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}
