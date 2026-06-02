package org.example.visitor;

public class NotaFiscalVisitor implements Visitor{
    private String nota = "";

    public void visitar(Pao pao){
        nota += "Pão Francẽs - R$ 1,00\n";
    }

    public void visitar(Bolo bolo) {
        nota += "Bolo - R$15,00\n";
    }

    @Override
    public void visitar(Cafe cafe) {
        nota += "Café - R$3,00\n";
    }

    public String getNota(){
        return nota;
    }
}
