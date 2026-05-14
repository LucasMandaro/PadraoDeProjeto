package factorymethod;

import org.example.Factorymethod.PadariaIServico;
import org.example.Factorymethod.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoEncomendaTest {

    @Test
    void deveExecutarEncomendaTest(){
        PadariaIServico servico = ServicoFactory.obterServico("Encomenda");
        assertEquals("Encomenda Realizada", servico.executar());
    }
    @Test
    void deveCancelarFormatura(){
        PadariaIServico servico = ServicoFactory.obterServico("Encomenda");
        assertEquals("Encomenda Cancelada", servico.cancelar());
    }

}
