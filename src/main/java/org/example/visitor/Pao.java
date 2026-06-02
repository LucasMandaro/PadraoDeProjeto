package org.example.visitor;

public class Pao implements Produto{
    public void aceitar(Visitor visitor){
        visitor.visitar(this);
    }
}
