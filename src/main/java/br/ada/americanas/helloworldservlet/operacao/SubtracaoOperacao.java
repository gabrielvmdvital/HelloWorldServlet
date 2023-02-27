package br.ada.americanas.helloworldservlet.operacao;

import java.math.BigDecimal;

public class SubtracaoOperacao implements Operacao {

        private BigDecimal first;
        private BigDecimal second;
        private BigDecimal result;


        @Override
        public BigDecimal execute(BigDecimal first, BigDecimal second) {
            this.first = first;
            this.second = second;
            result = first.subtract(second);
            return result;
        }

        @Override
        public String simbuloMatematico() {
            return "-";
        }

    @Override
    public String nomeOperacao() {
        return "subtracao";
    }

    @Override
    public String toString() {
        return first + "-" + second + " = " + result;
    }

}

