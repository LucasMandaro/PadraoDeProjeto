package org.example.visitor;

public interface Visitor {
    void visitar(Pao pao);
    void visitar(Bolo bolo);
    void visitar(Cafe cafe);
}
