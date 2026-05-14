package templatemethod;

import org.example.Templatemethod.Forno;
import org.example.Templatemethod.PaoDeSal;
import org.example.Templatemethod.PaoDoce;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FornoTest {

    @Test
    void deveRetornarTemperaturaIdealParaPaoDeSal(){
        Forno forno = new PaoDeSal(210);
        assertEquals("Temperatura ideal", forno.verificarTemperatura());
    }

    @Test
    void deveRetornarTemperaturaInadequadaParaPaoDeSal(){
        Forno forno = new PaoDeSal(190);
        assertEquals("Temperatura inadequada", forno.verificarTemperatura());
    }

    @Test
    void deveRetornarTemperaturaIdealParaPaoDoce(){
        Forno forno = new PaoDoce(190);
        assertEquals("Temperatura ideal", forno.verificarTemperatura());
    }

    @Test
    void deveRetornarTemperaturaInadequadaParaPaoDoce(){
        Forno forno = new PaoDoce(210);
        assertEquals("Temperatura inadequada", forno.verificarTemperatura());
    }


}
