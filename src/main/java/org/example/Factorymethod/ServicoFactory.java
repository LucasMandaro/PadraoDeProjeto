package org.example.Factorymethod;

public class ServicoFactory {

    public static PadariaIServico obterServico(String servico){
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("org.example.Factorymethod.Servico"+ servico);
            objeto = classe.newInstance();
        }catch (Exception ex){
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof PadariaIServico)){
            throw new IllegalArgumentException("Serviço invalido");
        }
        return (PadariaIServico) objeto;
    }
}
