package org.example.visitor;

public class Bolo implements Produto{
    public void aceitar(Visitor visitor){
        visitor.visitar(this);
    }
}
