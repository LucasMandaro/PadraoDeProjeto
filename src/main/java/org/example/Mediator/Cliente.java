package org.example.Mediator;

public class Cliente{
    public String realizarPedido(String item) {
        return Caixa.getInstancia().vender(item);
    }

    public String verificarEstoque(String item) {
        return Caixa.getInstancia().prontaEntrega(item);
    }

    public String encomendarProduto(String item) {
        return Caixa.getInstancia().encomendar(item);
    }

}
