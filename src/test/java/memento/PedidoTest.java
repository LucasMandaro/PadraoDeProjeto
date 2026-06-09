package memento;

import org.example.Memento.Pedido;
import org.example.Memento.PedidoEstadoAceito;
import org.example.Memento.PedidoEstadoCancelado;
import org.example.Memento.PedidoEstadoEntregue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    void deveArmazenarEstados(){
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertEquals(2, pedido.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial(){
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        pedido.restauraEstado(0);
        assertEquals(PedidoEstadoAceito.getInstance(), pedido.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior(){
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        pedido.restauraEstado(2);
        assertEquals(PedidoEstadoAceito.getInstance(), pedido.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido(){
        try {
            Pedido pedido = new Pedido();
            pedido.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Indice inválido", e.getMessage());
        }
    }
}
