package chainofresponsability;

import org.example.chainofresponsability.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DocumentoTest {

    FuncionarioBalcao balcao;
    FuncionarioCaixa caixa;
    FuncionarioEscritorio escritorio;

    @BeforeEach
    void setUp(){
        escritorio = new FuncionarioEscritorio(null);
        caixa = new FuncionarioCaixa(escritorio);
        balcao = new FuncionarioBalcao(caixa);
    }

    @Test
    void deveRetornarBalcaoParaAssinatura(){
        assertEquals("Balcao", balcao.assinarDocumento(new Documento(TipoDocumentoDeRecebimento.getTipoDocumentoDeRecebimento())));
    }

    @Test
    void deveRetornarCaixaParaAssinatura(){
        assertEquals("Caixa", caixa.assinarDocumento(new Documento(TipoDocumentoDePagamento.getTipoDocumentoDePagamento())));
    }

    @Test
    void deveRetornarEscritorioParaAssinatura(){
        assertEquals("Escritorio", escritorio.assinarDocumento(new Documento(TipoDocumentoBoleto.getTipoDocumentoBoleto())));
    }

    @Test
    void deveRetornarSemAssinatura(){
        assertEquals("Sem assinatura", balcao.assinarDocumento(new Documento(TipoDocumentoDeEncomenda.getTipoDocumentoDeEncomenda())));
    }

}
