package org.example.Decorator;

public abstract class ProdutoDecorator implements Produto {
    protected Produto produto;

    public ProdutoDecorator(Produto produto) {
        this.produto = produto;
    }

    public String getDescricao() {
        return produto.getDescricao();
    }

    public double getPreco() {
        return produto.getPreco();
    }
}
