package org.example.Bridge;

public class Caixa extends Cargo{

    public Caixa(float salarioBase){
        super(salarioBase);
    }

    public float calcularSalario(){
        return this.salarioBase * (1 + this.escolaridade.percentualAumento());
    }
}
