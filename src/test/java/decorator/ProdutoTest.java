package decorator;

import org.example.Decorator.Pao;
import org.example.Decorator.Presunto;
import org.example.Decorator.Produto;
import org.example.Decorator.Queijo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {
    @Test
    void deveRetornarPrecoPao(){
        Produto produto = new Pao();
        assertEquals(2.0f, produto.getPreco());
    }

    @Test
    void deveRetornarPrecoPaoComQueijo(){
        Produto produto = new Queijo( new Pao());
        assertEquals(3.5f, produto.getPreco());
    }

    @Test
    void deveRetornarPrecoPaoComPresunto(){
        Produto produto = new Presunto(new Pao());
        assertEquals(4.0f, produto.getPreco());
    }

    @Test
    void deveRetornarPrecoPaoComQueijoEPresunto(){
        Produto produto = new Queijo(
                new Presunto(
                        new Pao()));
        assertEquals(5.5f, produto.getPreco());
    }

    @Test
    void deveRetornarDescricaoPao(){
        Produto produto = new Pao();
        assertEquals("Pão", produto.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPaoComQueijo(){
        Produto produto = new Queijo(new Pao());
        assertEquals("Pão, Queijo", produto.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPaoComPresunto(){
        Produto produto = new Presunto(new Pao());
        assertEquals("Pão, Presunto", produto.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPaoComQueijoEPresunto(){
        Produto produto = new Queijo(new Presunto(new Pao()));
        assertEquals("Pão, Presunto, Queijo", produto.getDescricao());
    }

}
