package org.example.Decorator;

public class Queijo extends ProdutoDecorator{

    public Queijo(Produto produto) {
        super(produto);
    }

    public String getDescricao(){
        return produto.getDescricao() + ", Queijo";
    }

    public double getPreco(){
        return produto.getPreco() + 1.5f;
    }
}
