package org.example.chainofresponsability;

public class TipoDocumentoDeRecebimento implements TipoDocumento{

    private static TipoDocumentoDeRecebimento tipoDocumentoDeRecebimento = new TipoDocumentoDeRecebimento();

    private TipoDocumentoDeRecebimento(){};

    public static TipoDocumentoDeRecebimento getTipoDocumentoDeRecebimento(){
        return tipoDocumentoDeRecebimento;
    }
}
