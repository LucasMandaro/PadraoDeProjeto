package org.example.strategy;

public class Caixa {

    private String valor;

    public String getValor() {
        return valor;
    }

    public void pagarCredito(float valor1, float valor2){
        MaquinaDeCartão maquinaDeCartão = new MaquinaDeCartão(valor1, valor2);
        this.valor = maquinaDeCartão.pagar(new OperacaoCredito());
    }

    public void pagarDebito(float valor1, float valor2){
        MaquinaDeCartão maquinaDeCartão = new MaquinaDeCartão(valor1, valor2);
        this.valor = maquinaDeCartão.pagar(new OperacaoDebito());
    }

    public void pagarPix(float valor1, float valor2){
        MaquinaDeCartão maquinaDeCartão = new MaquinaDeCartão(valor1, valor2);
        this.valor = maquinaDeCartão.pagar(new OperacaoPix());
    }

    public void parcelarCredito12x(float valor1, float valor2){
        MaquinaDeCartão maquinaDeCartão = new MaquinaDeCartão(valor1, valor2);
        this.valor = maquinaDeCartão.pagar(new OperaçãoCredito12x());
    }
}
