package br.com.zup.Sistema_Loja.exceptions;

public class ClienteNaoEncontradoException extends RuntimeException{

    public ClienteNaoEncontradoException(String message) {
        super(message);
    }
}
