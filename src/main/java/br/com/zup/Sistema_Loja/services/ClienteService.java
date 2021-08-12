package br.com.zup.Sistema_Loja.services;

import br.com.zup.Sistema_Loja.dtos.ClienteDTO;
import br.com.zup.Sistema_Loja.dtos.ProdutoDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private List<ClienteDTO> listaDeClientes = new ArrayList<>();

    public void cadastrarCliente(ClienteDTO cliente) {

        listaDeClientes.add(cliente);

    }


    public ClienteDTO pesquisarClientePeloCPF(String cpf) {

        for (ClienteDTO cliente : listaDeClientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }

        }

        throw new RuntimeException("Cliente não encontrado. CPF inválido");


    }


    public List<ClienteDTO> exibirListaDeClientes() {
        return this.listaDeClientes;

    }

}
