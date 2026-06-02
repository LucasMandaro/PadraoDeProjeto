package org.example.strategy;

public class OperacaoDebito implements Operacao{

    public String pagar(float valor1, float valor2){
        if (valor2 > valor1){
            return "Saldo insulficiente";
        }else {
            float saldoRestante = valor1 - valor2;
            return "Pagamento realizado com sucesso! O saldo restante é de: " + saldoRestante;
        }
    }
}
