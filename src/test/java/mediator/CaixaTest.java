package mediator;
import org.example.Mediator.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaixaTest {

    @Test
    void deveRetornarPedidoEntregue(){
        Cliente cliente = new Cliente();
        assertEquals("Muito obrigado pela compra. \nAqui está o seu pedido: \nPão", cliente.realizarPedido("Pão"));
    }

    @Test
    void deveRetornarPedidoDoEstoque(){
        Cliente cliente = new Cliente();
        assertEquals("Iremos verificar se temos o Pão em estoque. \nTemos o Pão em estoque", cliente.verificarEstoque("Pão"));
    }

    @Test
    void deveRetornarPedidoEmProdução(){
        Cliente cliente = new Cliente();
        assertEquals("Agradecemos a sua encomenda de: \nPão\nIremos produzir a sua encomenda de: \nPão\n Obrigado pela preferencia", cliente.encomendarProduto("Pão"));
    }
}
