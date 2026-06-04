package org.example.Mediator;

public class Estoque {

    private static Estoque instancia = new Estoque();

    private Estoque(){}

    public static Estoque getInstancia(){
        return instancia;
    }

    public String verificarEstoque(String item){
        return "Temos o " + item + " em estoque";
    }
}
