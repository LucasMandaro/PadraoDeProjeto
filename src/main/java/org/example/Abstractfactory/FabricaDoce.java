package org.example.Abstractfactory;

public class FabricaDoce implements FabricaAbstrata{

    @Override
    public Pao createPao(){
        return new PaoDoce();
    }

    @Override
    public Torta createTorta(){
        return new TortaDoce();
    }
}
