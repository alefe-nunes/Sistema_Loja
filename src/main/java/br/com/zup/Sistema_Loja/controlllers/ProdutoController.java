package br.com.zup.Sistema_Loja.controlllers;

import br.com.zup.Sistema_Loja.dtos.ProdutoDTO;
import br.com.zup.Sistema_Loja.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarProduto(@RequestBody @Valid ProdutoDTO produto) {
        produtoService.cadastrarProduto(produto);
    }


    @GetMapping
    public List<ProdutoDTO> exibirListaDeProdutos() {
        return produtoService.exibirListaDeProdutos();
    }




}
