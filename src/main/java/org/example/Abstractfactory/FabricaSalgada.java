package org.example.Abstractfactory;

public class FabricaSalgada implements FabricaAbstrata{

    @Override
    public Pao createPao(){
        return new PaoDeSal();
    }

    @Override
    public Torta createTorta(){
        return new TortaSalgada();
    }

}
