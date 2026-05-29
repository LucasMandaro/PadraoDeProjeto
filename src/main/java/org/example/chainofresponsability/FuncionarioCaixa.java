package org.example.chainofresponsability;

public class FuncionarioCaixa extends Funcionario{

    public FuncionarioCaixa(Funcionario superior){
        listaDocumentos.add(TipoDocumentoDePagamento.getTipoDocumentoDePagamento());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo(){
        return "Caixa";
    }
}
