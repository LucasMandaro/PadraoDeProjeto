package state;
import org.example.State.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    Pedido pedido;

    @BeforeEach
    public void setUp(){
        pedido = new Pedido();
    }

    //Pedido Pendente

    @Test
    public void naoDeveDeixarPendentePedidoPendente(){
        pedido.setEstado(PedidoEstadoPendente.getInstance());
        assertFalse(pedido.pendente());
    }


    @Test
    public void deveAceitarPedido(){
        pedido.setEstado(PedidoEstadoPendente.getInstance());
        assertTrue(pedido.aceito());
        assertEquals(PedidoEstadoAceito.getInstance(), pedido.getEstado());
    }

    @Test
    public void devecancelarPedidoPendente(){
        pedido.setEstado(PedidoEstadoPendente.getInstance());
        assertTrue(pedido.cancelado());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    //Pedido Cancelado

    @Test
    public void naoDeveDeixarPendentePedidoCancelado(){
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.pendente());
    }

    @Test
    public void naoDeveAceitarPedidoCancelado(){
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.aceito());
    }

    @Test
    public void naoDeveSairParaEntregaPedidoCancelado(){
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.saiuParaEntrega());
    }

    @Test
    public void naoDeveEntregarPedidoCancelado(){
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.entregue());
    }

    //Pedido Aceito

    @Test
    public void deveSairParaEntregaPedidoAceito(){
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        assertTrue(pedido.saiuParaEntrega());
        assertEquals(PedidoEstadoSaiuParaEntrega.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveAceitarPedidoAceito(){
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        assertFalse(pedido.aceito());
    }

    @Test
    public void deveSerCancelarPedidoAceito(){
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        assertTrue(pedido.cancelado());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveEntragarPedidoAceito(){
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        assertFalse(pedido.entregue());
    }

    @Test
    public void naoDeveDeixarPendentePedidoAceito(){
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        assertFalse(pedido.pendente());
    }

    // Pedido Saiu para entrega

    @Test
    public void deveSerEntreguePedidoQueSaiuParaEntrega(){
        pedido.setEstado(PedidoEstadoSaiuParaEntrega.getInstance());
        assertTrue(pedido.entregue());
        assertEquals(PedidoEstadoEntregue.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveSairParaEntregaPedidoQueJaSaiu(){
        pedido.setEstado(PedidoEstadoSaiuParaEntrega.getInstance());
        assertFalse(pedido.saiuParaEntrega());
    }

    @Test
    public void naoDeveMudarDeSaiuParaEntregaParaPendante(){
        pedido.setEstado(PedidoEstadoSaiuParaEntrega.getInstance());
        assertFalse(pedido.pendente());
    }

    @Test
    public void naoDeveMudarDeSaiuParaEntregaParaAceito(){
        pedido.setEstado(PedidoEstadoSaiuParaEntrega.getInstance());
        assertFalse(pedido.aceito());
    }

    @Test
    public void deveCancelarPedidoQueSaiuParaEntrega(){
        pedido.setEstado(PedidoEstadoSaiuParaEntrega.getInstance());
        assertTrue(pedido.cancelado());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    //Pedido Entregue

    @Test
    public void naoDeveEntregarPedidoEntregue(){
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.entregue());
    }

    @Test
    public void naoDeveDeixarPendentePedidoEntregue(){
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.pendente());
    }

    @Test
    public void naoDeveAceitarPedidoEntregue(){
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.aceito());
    }

    @Test
    public void naoDeveSairParaEntregaPedidoEntregue(){
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.saiuParaEntrega());
    }

    @Test
    public void naoDeveCancelarPedidoEntregue(){
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.cancelado());
    }

}
