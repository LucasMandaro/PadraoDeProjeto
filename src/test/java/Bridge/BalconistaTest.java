package Bridge;

import org.example.Bridge.Balconista;
import org.example.Bridge.EnsinoMedio;
import org.example.Bridge.Escolaridade;
import org.example.Bridge.Graduacao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BalconistaTest {

    @Test
    void deveRetornarSalarioBalconistaComEnsinoMedio(){
        Escolaridade escolaridade = new EnsinoMedio();
        Balconista balconista = new Balconista(2000.0f);
        balconista.setEscolaridade(escolaridade);
        assertEquals(2000.0f, balconista.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioBalconistaComGraduacao(){
        Escolaridade escolaridade = new Graduacao();
        Balconista balconista = new Balconista(2000.0f);
        balconista.setEscolaridade(escolaridade);
        assertEquals(2200.0f, balconista.calcularSalario(), 0.01f);
    }
}
