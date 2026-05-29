package org.example.chainofresponsability;

public class FuncionarioBalcao extends Funcionario{

    public FuncionarioBalcao(Funcionario superior){
        listaDocumentos.add(TipoDocumentoDeRecebimento.getTipoDocumentoDeRecebimento());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo(){
        return "Balcao";
    }
}
