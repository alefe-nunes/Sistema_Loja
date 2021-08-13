package br.com.zup.Sistema_Loja.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ControleAdvisor {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public MensagemDeErro manipulaExcessoesDeValidacao(MethodArgumentNotValidException exception) {
        List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
        List<Erro> erros = fieldErrors.stream()
                .map(objeto -> new Erro(objeto.getDefaultMessage())).collect(Collectors.toList());
        return new MensagemDeErro(400, erros);
    }

    @ExceptionHandler(ClienteNaoEncontradoException.class)
    public MensagemDeErro manipularClienteNaoEncontrado(ClienteNaoEncontradoException exception) {
        List<Erro> erros = Arrays.asList(new Erro(exception.getMessage()));
        return new MensagemDeErro(400, erros);
    }

    @ExceptionHandler(CPFRepetidoException.class)
    public MensagemDeErro manipularCPFRepetidoException(CPFRepetidoException exception) {
        List<Erro> erros = Arrays.asList(new Erro(exception.getMessage()));
        return new MensagemDeErro(400, erros);
    }

    @ExceptionHandler(EmailRepetidoException.class)
    public MensagemDeErro manipularEmailRepetido(EmailRepetidoException exception) {
        List<Erro> erros = Arrays.asList(new Erro(exception.getMessage()));
        return new MensagemDeErro(400, erros);
    }

    @ExceptionHandler(ProdutoJaCadastradoException.class)
    public MensagemDeErro manipularProdutoJaCadastrado(ProdutoJaCadastradoException exception) {
        List<Erro> erros = Arrays.asList(new Erro(exception.getMessage()));
        return new MensagemDeErro(400, erros);
    }


}
