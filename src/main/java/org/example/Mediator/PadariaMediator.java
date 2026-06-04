package org.example.Mediator;

public interface PadariaMediator {
    String realizarPedido(String item);
    String verificarEstoque(String item);
    String produzir(String item);
}
