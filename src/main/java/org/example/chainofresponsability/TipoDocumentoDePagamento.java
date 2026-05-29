package org.example.chainofresponsability;

public class TipoDocumentoDePagamento implements TipoDocumento{

    private static TipoDocumentoDePagamento tipoDocumentoDePagamento = new TipoDocumentoDePagamento();

    private TipoDocumentoDePagamento(){};

    public static TipoDocumentoDePagamento getTipoDocumentoDePagamento(){
        return tipoDocumentoDePagamento;
    }
}
