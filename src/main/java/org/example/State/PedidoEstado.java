package org.example.State;

public abstract class PedidoEstado {

    public abstract String getEstado();

    public boolean pendente(Pedido pedido){
        return false;
    }

    public boolean aceito(Pedido pedido){
        return false;
    }

    public boolean cancelado(Pedido pedido){
        return false;
    }

    public boolean saiuParaEntrega(Pedido pedido){
        return false;
    }

    public boolean entregue(Pedido pedido){
        return false;
    }
}
