package org.example.Mediator;

public class Caixa {
    private static Caixa instancia = new Caixa();

    private Caixa(){}

    public static Caixa getInstancia() {
        return instancia;
    }

    public String vender(String item){
        return "Muito obrigado pela compra. \n" + Padaria.getInstancia().realizarPedido(item);
    }

    public String prontaEntrega(String item){
        return "Iremos verificar se temos o " + item + " em estoque. \n" + Estoque.getInstancia().verificarEstoque(item);
    }

    public String encomendar(String item){
        return "Agradecemos a sua encomenda de: \n" + item + "\n" + Cozinha.getInstancia().produzir(item);
    }
}
