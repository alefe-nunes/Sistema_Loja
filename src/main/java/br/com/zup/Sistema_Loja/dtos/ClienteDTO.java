package br.com.zup.Sistema_Loja.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class ClienteDTO {

    @NotBlank(message = "{validacao.nome.cliente}")
    private String nome;

    @NotBlank(message = "{validacao.cpf.cliente}")
    private String cpf;

    @Email(message = "{validacao.email.cliente}")
    private String email;

    public ClienteDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
