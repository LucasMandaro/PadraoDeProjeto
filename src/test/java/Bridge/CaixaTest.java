package Bridge;

import org.example.Bridge.Caixa;
import org.example.Bridge.EnsinoMedio;
import org.example.Bridge.Escolaridade;
import org.example.Bridge.Graduacao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaixaTest {

    @Test
    void deveRetornarSalarioCaixaComEnsinoMedio(){
        Escolaridade escolaridade = new EnsinoMedio();
        Caixa caixa = new Caixa(1000.0f);
        caixa.setEscolaridade(escolaridade);
        assertEquals(1000.0f, caixa.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioCaixaComGraduacao(){
        Escolaridade escolaridade = new Graduacao();
        Caixa caixa = new Caixa(1000.0f);
        caixa.setEscolaridade(escolaridade);
        assertEquals(1100.0f, caixa.calcularSalario(), 0.01f);
    }
}
