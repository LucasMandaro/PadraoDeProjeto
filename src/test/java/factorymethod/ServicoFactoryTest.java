package factorymethod;
import org.example.Factorymethod.PadariaIServico;
import org.example.Factorymethod.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ServicoFactoryTest {

    @Test
    void deveRetornarExcecaoParaServicoInexistente(){
        try {
            PadariaIServico servico = ServicoFactory.obterServico("Evasao");
            fail();
        }catch (IllegalArgumentException e ){
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido(){
        try {
            PadariaIServico servico = ServicoFactory.obterServico("Invalido");
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Serviço invalido", e.getMessage());
        }
    }
}
