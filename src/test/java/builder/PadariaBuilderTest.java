package builder;

import org.example.Builder.Padaria;
import org.example.Builder.PadariaBuilder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class PadariaBuilderTest {

    @Test
    void deveRetornarExcecaoParaPadariaSemNome(){
        try {
            PadariaBuilder padariaBuilder = new PadariaBuilder();
            Padaria padaria = padariaBuilder
                    .setBairro("Teste")
                    .setCidade("teste1")
                    .build();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarPadariaValido(){
        PadariaBuilder padariaBuilder = new PadariaBuilder();
        Padaria padaria = padariaBuilder
                .setNome("Teste")
                .setNomeDono("Teste1")
                .build();

        assertNotNull(padaria);
    }
}
