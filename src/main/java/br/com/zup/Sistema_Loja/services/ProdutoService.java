package br.com.zup.Sistema_Loja.services;

import br.com.zup.Sistema_Loja.dtos.ProdutoDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    private List<ProdutoDTO> produtos = new ArrayList<>();


    public void cadastrarProduto(ProdutoDTO produto) {
        verificarProdutoRepetido(produto.getNome());
        produtos.add(produto);

    }

    public void verificarProdutoRepetido(String nome) {

        for (ProdutoDTO produto : produtos) {
            if (produto.getNome().equals(nome)) {
                throw new RuntimeException("Produto já cadastrado no sistema");
            }

        }
    }


    public List<ProdutoDTO> exibirListaDeProdutos() {
        return this.produtos;

    }


}
