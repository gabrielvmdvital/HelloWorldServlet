package br.ada.americanas.helloworldservlet.operacao;

import java.math.BigDecimal;

class SomaOperacao implements Operacao {

    private BigDecimal first;
    private BigDecimal second;
    private BigDecimal result;


    @Override
    public BigDecimal execute(BigDecimal first, BigDecimal second) {
        this.first = first;
        this.second = second;
        result = first.add(second);
        return result;
    }

    @Override
    public String simbuloMatematico() {
        return "+";
    }

    @Override
    public String nomeOperacao() {
        return "soma";
    }

    @Override
    public String toString() {
        return first + "+" + second + " = " + result;
    }
}
