package visitor;

import org.example.visitor.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PedidoVisitorTest {

    @Test
    void deveExibirPrecoPao(){
        Pedido pedido = new Pedido();
        pedido.adicionarProduto(new Pao());
        CalculadoraPrecoVisitor calculadora = new CalculadoraPrecoVisitor();
        pedido.aceitar(calculadora);
        assertEquals(1.00, calculadora.getTotal());
    }

    @Test
    void deveExibirPrecoBolo(){
        Pedido pedido = new Pedido();
        pedido.adicionarProduto(new Bolo());
        CalculadoraPrecoVisitor calculadora = new CalculadoraPrecoVisitor();
        pedido.aceitar(calculadora);
        assertEquals(15.00, calculadora.getTotal());
    }

    @Test
    void deveExibirPrecoCafe(){
        Pedido pedido = new Pedido();
        pedido.adicionarProduto(new Cafe());
        CalculadoraPrecoVisitor calculadora = new CalculadoraPrecoVisitor();
        pedido.aceitar(calculadora);
        assertEquals(3.00, calculadora.getTotal());
    }

    @Test
    void deveExibir2Itens(){
        Pedido pedido = new Pedido();
        pedido.adicionarProduto(new Pao());
        pedido.adicionarProduto(new Cafe());
        CalculadoraPrecoVisitor calculadora = new CalculadoraPrecoVisitor();
        pedido.aceitar(calculadora);
        assertEquals(4.00, calculadora.getTotal());
    }

    @Test
    void deveExibir3Itens(){
        Pedido pedido = new Pedido();
        pedido.adicionarProduto(new Pao());
        pedido.adicionarProduto(new Bolo());
        pedido.adicionarProduto(new Cafe());
        CalculadoraPrecoVisitor calculadora = new CalculadoraPrecoVisitor();
        pedido.aceitar(calculadora);
        assertEquals(19.00, calculadora.getTotal());
    }

    @Test
    void deveExibirNotaFiscalPao(){
        Pedido pedido = new Pedido();
        pedido.adicionarProduto(new Pao());
        NotaFiscalVisitor notaFiscal = new NotaFiscalVisitor();
        pedido.aceitar(notaFiscal);
        assertEquals("Pão Francẽs - R$ 1,00\n", notaFiscal.getNota());
    }

    @Test
    void deveExibirNotaFiscalBolo(){
        Pedido pedido = new Pedido();
        pedido.adicionarProduto(new Bolo());
        NotaFiscalVisitor nota = new NotaFiscalVisitor();
        pedido.aceitar(nota);
        assertEquals("Bolo - R$15,00\n", nota.getNota());
    }

    @Test
    void deveExibirNotaFiscalCafe(){
        Pedido pedido = new Pedido();
        pedido.adicionarProduto(new Cafe());
        NotaFiscalVisitor nota = new NotaFiscalVisitor();
        pedido.aceitar(nota);
        assertEquals("Café - R$3,00\n", nota.getNota());
    }

    @Test
    void deveExibirNotaFiscal2Itens(){
        Pedido pedido = new Pedido();
        pedido.adicionarProduto(new Pao());
        pedido.adicionarProduto(new Cafe());
        NotaFiscalVisitor nota = new NotaFiscalVisitor();
        pedido.aceitar(nota);
        assertEquals("Pão Francẽs - R$ 1,00\nCafé - R$3,00\n", nota.getNota());
    }

    @Test
    void deveExibirNotaFiscal3Itens(){
        Pedido pedido = new Pedido();
        pedido.adicionarProduto(new Pao());
        pedido.adicionarProduto(new Bolo());
        pedido.adicionarProduto(new Cafe());
        NotaFiscalVisitor nota = new NotaFiscalVisitor();
        pedido.aceitar(nota);
        assertEquals("Pão Francẽs - R$ 1,00\nBolo - R$15,00\nCafé - R$3,00\n", nota.getNota());
    }

}
