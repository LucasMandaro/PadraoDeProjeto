package abstractfactory;

import org.example.Abstractfactory.FabricaAbstrata;
import org.example.Abstractfactory.FabricaDoce;
import org.example.Abstractfactory.FabricaSalgada;
import org.example.Abstractfactory.Padaria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PadariaTest {

    @Test
    void deveVerificarPaoDoce(){
        FabricaAbstrata fabrica = new FabricaDoce();
        Padaria padaria = new Padaria(fabrica);
        assertEquals("Temos Pao Doce", padaria.verificarPao());
    }

    @Test
    void deveVerificarPaoDeSal(){
        FabricaAbstrata fabrica = new FabricaSalgada();
        Padaria padaria = new Padaria(fabrica);
        assertEquals("Temos Pao de sal", padaria.verificarPao());
    }

    @Test
    void deveVerificarTortaDoce(){
        FabricaAbstrata fabrica = new FabricaDoce();
        Padaria padaria = new Padaria(fabrica);
        assertEquals("Temos Torta Doce", padaria.verificarTorta());
    }

    @Test
    void deveVerificarTortaSalgada(){
        FabricaAbstrata fabrica = new FabricaSalgada();
        Padaria padaria = new Padaria(fabrica);
        assertEquals("Temos Torta Salgada", padaria.verificarTorta());
    }
}
