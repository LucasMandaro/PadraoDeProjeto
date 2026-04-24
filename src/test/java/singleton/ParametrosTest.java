package singleton;

import org.example.Singleton.Parametros;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParametrosTest {

    @Test
    public void deveRetornarNomePadaria(){
        Parametros.getInstance().setNomePadaria("Padaria Mandaro");
        assertEquals("Padaria Mandaro", Parametros.getInstance().getNomePadaria());
    }

    @Test
    public void deveRetornarFuncionario(){
        Parametros.getInstance().setFunciomarioLogado("Lucas");
        assertEquals("Lucas",Parametros.getInstance().getFunciomarioLogado());
    }
}
