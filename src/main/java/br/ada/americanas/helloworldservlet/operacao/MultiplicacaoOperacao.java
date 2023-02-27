package br.ada.americanas.helloworldservlet.operacao;

import java.math.BigDecimal;

public class MultiplicacaoOperacao implements Operacao {

    private BigDecimal first;
    private BigDecimal second;
    private BigDecimal result;


    @Override
    public BigDecimal execute(BigDecimal first, BigDecimal second) {
        this.first = first;
        this.second = second;
        result = first.multiply(second);
        return result;
    }

    @Override
    public String simbuloMatematico() {
        return "*";
    }

    @Override
    public String nomeOperacao() {
        return "multiplicacao";
    }

    @Override
    public String toString() {
        return first + "*" + second + " = " + result;
    }
}
