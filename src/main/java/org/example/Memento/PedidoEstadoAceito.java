package org.example.Memento;

public class PedidoEstadoAceito implements PedidoEstado{
    private PedidoEstadoAceito(){};
    private static PedidoEstadoAceito instance = new PedidoEstadoAceito();
    public static PedidoEstadoAceito getInstance(){
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Aceito";
    }
}
