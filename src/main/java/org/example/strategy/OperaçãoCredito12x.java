package org.example.strategy;

public class OperaçãoCredito12x implements Operacao {

    public String pagar(float valor1, float valor2){
        if (valor2 > valor1){
            return "Credito insulficiente";
        }else {
            float saldoRestante = valor1 - valor2;
            float parcelas = valor2 / 12;
            return "Pagamento realizado com sucesso! O saldo restante é de: " + saldoRestante +
                    "A Compra foi Parcelada em 12x de " + parcelas + " reais";
        }
    }
}
