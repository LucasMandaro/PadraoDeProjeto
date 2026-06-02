package org.example.visitor;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Produto> produtos;

    public Pedido(){
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void aceitar(Visitor visitor){
        for (Produto produto : produtos){
            produto.aceitar(visitor);
        }
    }
}
