package br.com.zup.Sistema_Loja.services;

import br.com.zup.Sistema_Loja.dtos.ClienteDTO;
import br.com.zup.Sistema_Loja.exceptions.CPFRepetidoException;
import br.com.zup.Sistema_Loja.exceptions.ClienteNaoEncontradoException;
import br.com.zup.Sistema_Loja.exceptions.EmailRepetidoException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private List<ClienteDTO> listaDeClientes = new ArrayList<>();

    public void cadastrarCliente(ClienteDTO cliente) {
        verificarCPFDuplicado(cliente.getCpf());
        verificarEmailDuplicado(cliente.getEmail());
        listaDeClientes.add(cliente);

    }

    public void verificarCPFDuplicado(String cpf) {

        for (ClienteDTO cliente : listaDeClientes) {
            if (cliente.getCpf().equals(cpf)) {
                throw new CPFRepetidoException("Cliente já cadastrado. CPF repetido");
            }

        }
    }

    public void verificarEmailDuplicado(String email) {

        for (ClienteDTO cliente : listaDeClientes) {
            if (cliente.getEmail().equals(email)) {
                throw new EmailRepetidoException("Cliente já cadastrado. E-mail repetido");
            }

        }
    }

    public ClienteDTO pesquisarClientePeloCPF(String cpf) {

        for (ClienteDTO cliente : listaDeClientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }

        }

        throw new ClienteNaoEncontradoException("Cliente não encontrado. CPF inválido");


    }


    public List<ClienteDTO> exibirListaDeClientes() {
        return this.listaDeClientes;

    }

}
