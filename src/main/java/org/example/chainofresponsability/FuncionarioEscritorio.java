package org.example.chainofresponsability;

public class FuncionarioEscritorio extends Funcionario{

    public FuncionarioEscritorio(Funcionario superior){
        listaDocumentos.add(TipoDocumentoBoleto.getTipoDocumentoBoleto());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo(){
        return "Escritorio";
    }
}
