package br.com.zup.Sistema_Loja.services;

import br.com.zup.Sistema_Loja.dtos.CompraDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompraService {

    private List<CompraDTO> listaDeCompras = new ArrayList<>();

    public CompraDTO cadastrarCompra(CompraDTO compra) {
        listaDeCompras.add(compra);
        return compra;
    }


    public List<CompraDTO> exibirListaDeCompras() {
        return this.listaDeCompras;

    }


}
