package br.com.zup.Sistema_Loja.controlllers;

import br.com.zup.Sistema_Loja.dtos.CompraDTO;
import br.com.zup.Sistema_Loja.services.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping ("/compras")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarCompra(@RequestBody CompraDTO compra) {
        compraService.cadastrarCompra(compra);
    }

    @GetMapping
    public List <CompraDTO> exibirListaDeCompras () {
        return compraService.exibirListaDeCompras();
    }

}
