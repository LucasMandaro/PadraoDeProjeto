package org.example.Decorator;

public class Presunto extends ProdutoDecorator{
    public Presunto(Produto produto){
        super(produto);
    }

    public String getDescricao(){
        return produto.getDescricao() + ", Presunto";
    }

    public double getPreco(){
        return produto.getPreco() + 2.0f;
    }
}
