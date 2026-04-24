package org.example.Factorymethod;

public class ServicoPedido implements PadariaIServico{

    public String executar() {
        return "Pedido Realizado";
    }

    public String cancelar() {
        return "Pedido Cancelado";
    }
}
