package br.com.zup.Sistema_Loja.exceptions;

public class EmailRepetidoException extends RuntimeException{

    public EmailRepetidoException(String message) {
        super(message);
    }
}
