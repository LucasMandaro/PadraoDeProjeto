package org.example.visitor;

public class Cafe implements Produto{
    public void aceitar(Visitor visitor){
        visitor.visitar(this);
    }
}
