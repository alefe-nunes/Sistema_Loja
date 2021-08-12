package br.com.zup.Sistema_Loja.dtos;

import java.util.ArrayList;
import java.util.List;

public class CompraDTO {

    private ClienteDTO cliente;
    private List <ProdutoDTO> listaDeProdutos = new ArrayList<>();

    public CompraDTO() {
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public List<ProdutoDTO> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void setListaDeProdutos(List<ProdutoDTO> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }
}
