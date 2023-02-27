package br.ada.americanas.helloworldservlet.operacao;

public class OperacaoFactory {

    public static Operacao create(String simbuloMatematico){
        Operacao operacao;

        switch (simbuloMatematico){
            case "+" : {
                operacao = new SomaOperacao();
                break;
            }

            case "-": {
                operacao = new SubtracaoOperacao();
                break;
            }
            case "*": {
                operacao = new MultiplicacaoOperacao();
                break;
            }
            case "/": {
                operacao = new DivisaoOperacao();
                break;
            }
            default:{
                throw new RuntimeException("Operação não permitida");
            }
        }
        return operacao;
    }
}
