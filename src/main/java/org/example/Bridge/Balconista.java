package org.example.Bridge;

public class Balconista extends Cargo {

    public Balconista(float salarioBase){
        super(salarioBase);
    }

    public float calcularSalario(){
        return this.salarioBase * (1 + this.escolaridade.percentualAumento());
    }
}
