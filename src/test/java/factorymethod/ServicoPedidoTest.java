package factorymethod;

import org.example.Factorymethod.PadariaIServico;
import org.example.Factorymethod.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoPedidoTest {

    @Test
    void deveExecutarPedidoTest(){
        PadariaIServico servico = ServicoFactory.obterServico("Pedido");
        assertEquals("Pedido Realizado", servico.executar());
    }

    @Test
    void deveCancelarPedidoTest(){
        PadariaIServico servico = ServicoFactory.obterServico("Pedido");
        assertEquals("Pedido Cancelado", servico.cancelar());
    }
}
