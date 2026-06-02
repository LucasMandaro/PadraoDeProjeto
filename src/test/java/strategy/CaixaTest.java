package strategy;

import org.example.strategy.Caixa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CaixaTest {

    @Test
    void devePagarCredito(){
        Caixa caixa = new Caixa();
        caixa.pagarCredito(100.0f, 50.0f);
        assertEquals("Pagamento realizado com sucesso! O saldo restante é de: 50.0", caixa.getValor());
    }

    @Test
    void devePagarDebito(){
        Caixa caixa = new Caixa();
        caixa.pagarDebito(100.0f, 50.0f);
        assertEquals("Pagamento realizado com sucesso! O saldo restante é de: 50.0", caixa.getValor());
    }

    @Test
    void devePagarPix(){
        Caixa caixa = new Caixa();
        caixa.pagarPix(100.0f, 50.0f);
        assertEquals("Pagamento realizado com sucesso! O saldo restante é de: 50.0", caixa.getValor());
    }

    @Test
    void deveParcelarCredito12x(){
        Caixa caixa = new Caixa();
        caixa.parcelarCredito12x(100.0f,80.0f);
        assertEquals("Pagamento realizado com sucesso! O saldo restante é de: 20.0A Compra foi Parcelada em 12x de 6.6666665 reais", caixa.getValor());
    }

    @Test
    void devePagarCreditoInsulficiente(){
        Caixa caixa = new Caixa();
        caixa.pagarCredito(50.0f, 100.0f);
        assertEquals("Credito insulficiente", caixa.getValor());
    }

    @Test
    void devePagarDebitoInsulficiente(){
        Caixa caixa = new Caixa();
        caixa.pagarDebito(50.0f, 100.0f);
        assertEquals("Saldo insulficiente", caixa.getValor());
    }

    @Test
    void devePagarPixInsulficiente(){
        Caixa caixa = new Caixa();
        caixa.pagarPix(50.0f, 100.0f);
        assertEquals("Saldo insulficiente", caixa.getValor());
    }

    @Test
    void deveParcelarCredito12xInsulficiente(){
        Caixa caixa = new Caixa();
        caixa.parcelarCredito12x(50.0f, 200.0f);
        assertEquals("Credito insulficiente", caixa.getValor());
    }
}
