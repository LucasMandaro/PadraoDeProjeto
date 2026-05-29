package org.example.State;

public class Pedido {
    private String nome;
    private String endereco;
    private String itens;
    private PedidoEstado estado;

    public Pedido() {
        this.estado = PedidoEstadoPendente.getInstance();
    }

    public void setEstado(PedidoEstado estado){
        this.estado = estado;
    }

    public PedidoEstado getEstado(){
        return estado;
    }

    public boolean pendente(){
        return estado.pendente(this);
    }

    public boolean aceito(){
        return estado.aceito(this);
    }

    public boolean saiuParaEntrega(){
        return estado.saiuParaEntrega(this);
    }

    public boolean entregue(){
        return estado.entregue(this);
    }

    public boolean cancelado(){
        return estado.cancelado(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getItens() {
        return itens;
    }
}
