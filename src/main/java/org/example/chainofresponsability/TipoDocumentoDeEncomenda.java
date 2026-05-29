package org.example.chainofresponsability;

public class TipoDocumentoDeEncomenda implements TipoDocumento{

    private static TipoDocumentoDeEncomenda tipoDocumentoDeEncomenda = new TipoDocumentoDeEncomenda();

    private TipoDocumentoDeEncomenda(){};

    public static TipoDocumentoDeEncomenda getTipoDocumentoDeEncomenda(){
        return tipoDocumentoDeEncomenda;
    }
}
