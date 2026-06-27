package org.example.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Franquia {

    private List<Padaria> padarias = new ArrayList<>();

    public void addPadaria(String nome, String nomecidade, String uf) {
        Cidade cidade = CidadeFactory.getCidade(nomecidade, uf);
        Padaria padaria = new Padaria(nome, cidade);
        padarias.add(padaria);
    }

    public List<String> obterPadarias(){
        List<String> saida = new ArrayList<String>();
        for (Padaria padaria : this.padarias){
            saida.add(padaria.obterPadaria());
        }
        return saida;
    }
}
