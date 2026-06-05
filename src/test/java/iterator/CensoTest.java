package iterator;

import org.example.Iterator.Censo;
import org.example.Iterator.Cliente;
import org.example.Iterator.Padaria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CensoTest {

    @Test
    void deveContarClientesAtivosComConta(){
        Padaria padaria = new Padaria(
                new Cliente("José", true),
                new Cliente("Maria", false),
                new Cliente("João", true)
        );
        assertEquals(2, Censo.contarClientesComConta(padaria));
    }

    @Test
    void deveContarTotalClientes(){
        Padaria padaria = new Padaria(
                new Cliente("José", true),
                new Cliente("Maria", false),
                new Cliente("João", true)
        );
        assertEquals(3, Censo.contatTotalClientes(padaria));
    }
}
