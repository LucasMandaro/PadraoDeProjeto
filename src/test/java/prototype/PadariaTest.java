package prototype;

import org.example.Prototype.Endereco;
import org.example.Prototype.Padaria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PadariaTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Padaria padaria = new Padaria("Padaria Original", new Endereco("Rua b", 1));

        Padaria clone = padaria.clone();
        clone.setNome("Padaria Clone");
        clone.getEndereco().setNumero(2);

        assertEquals("Padaria{nome=Padaria Original, endereco=Endereco{logradouro=Rua b, numero=1}}", padaria.toString());
        assertEquals("Padaria{nome=Padaria Clone, endereco=Endereco{logradouro=Rua b, numero=2}}", clone.toString());
    }
}
