package br.com.zup.Sistema_Loja.dtos;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class ProdutoDTO {

    @NotBlank(message = "{validacao.nome.produto}")
    private String nome;

    @NotBlank(message = "{validacao.nome.preco}")
    private double preco;

    @Min(value = 1, message = "{validacao.quantidade.produto}")
    private int quantidade;

    public ProdutoDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
