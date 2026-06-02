package org.example.visitor;

public class CalculadoraPrecoVisitor implements Visitor{

    private double total;

    public void visitar(Pao pao){
        total += 1.00;
    }

    public void visitar(Bolo bolo){
        total += 15.00;
    }

    public void visitar(Cafe cafe){
        total += 3.00;
    }

    public double getTotal(){
        return total;
    }
}
