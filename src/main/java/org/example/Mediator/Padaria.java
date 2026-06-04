package org.example.Mediator;

public class Padaria implements PadariaMediator {

    private static Padaria instancia = new Padaria();

    private Padaria(){}

    public static Padaria getInstancia() {
        return instancia;
    }

    @Override
    public String realizarPedido(String item) {
        return "Aqui está o seu pedido: \n" + item ;
    }

    @Override
    public String verificarEstoque(String item) {
        return "Temos o " + item + " em estoque";
    }

    @Override
    public String produzir(String item) {
        return "Iremos produzir a sua encomenda de: \n" + item + "\n Obrigado pela preferencia";
    }
}
