package command;
import org.example.command.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class PadariaTest {

    Padaria padaria;
    Pao pao;

    @BeforeEach
    void seUp(){
        padaria = new Padaria();
        pao = new Pao(1, "Pequeno");
    }

    @Test
    void deveRealizarEncomenda(){
        Encomenda realizarEncomenda = new RealizarEncomenda(pao);
        padaria.executarTarefa(realizarEncomenda);
        assertEquals("Encomenda aceita", pao.getSituacao());
    }

    @Test
    void deveCancelarEncomenda(){
        Encomenda cancelarEncomenda = new CancelarEncomenda(pao);
        padaria.executarTarefa(cancelarEncomenda);
        assertEquals("Encomenda cancelada", pao.getSituacao());
    }

    @Test
    void deveCancelarCancelamentoDaEncomenda(){
        Encomenda realizarEncomenda = new RealizarEncomenda(pao);
        Encomenda cancelarEncomenda = new CancelarEncomenda(pao);
        padaria.executarTarefa(realizarEncomenda);
        padaria.executarTarefa(cancelarEncomenda);
        padaria.cancelarUltimaEncomenda();
        assertEquals("Encomenda aceita", pao.getSituacao());
    }

}
