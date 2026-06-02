package org.example.strategy;

public class MaquinaDeCartão {
    private float valor1;
    private float valor2;
    
    public MaquinaDeCartão(float valor1, float valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public String pagar(Operacao operacao){
        return operacao.pagar(valor1, valor2);
    }
}
