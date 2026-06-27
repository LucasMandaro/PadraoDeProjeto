package flyweight;

import static org.junit.jupiter.api.Assertions.*;

import org.example.Flyweight.CidadeFactory;
import org.example.Flyweight.Franquia;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FranquiaTest {

    @Test
    void deveRetornarPadarias(){
        Franquia franquia = new Franquia();

        franquia.addPadaria("Jose", "Juiz de Fora", "MG");
        franquia.addPadaria("Maria", "Juiz de Fora", "MG");
        franquia.addPadaria("Ana", "Juiz de Fora", "MG");
        franquia.addPadaria("Pedro", "Juiz de Fora", "MG");

        List<String> saida = Arrays.asList(
                "Padaria{ nome= 'Jose', cidade= 'Juiz de Fora', uf= 'MG'}",
                "Padaria{ nome= 'Maria', cidade= 'Juiz de Fora', uf= 'MG'}",
                "Padaria{ nome= 'Ana', cidade= 'Juiz de Fora', uf= 'MG'}",
                "Padaria{ nome= 'Pedro', cidade= 'Juiz de Fora', uf= 'MG'}");

        assertEquals(saida, franquia.obterPadarias());
    }

    @Test
    void deveRetornarTotalCidades(){
        Franquia franquia = new Franquia();

        franquia.addPadaria("Jose", "Juiz de Fora", "MG");
        franquia.addPadaria("Maria", "Juiz de Fora", "MG");
        franquia.addPadaria("Ana", "Juiz de Fora", "MG");
        franquia.addPadaria("Pedro", "Santos Dumont", "MG");

        assertEquals(2, CidadeFactory.getTotalCidades());
    }
}
