package br.com.zup.Sistema_Loja.controlllers;

import br.com.zup.Sistema_Loja.dtos.ClienteDTO;
import br.com.zup.Sistema_Loja.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping ("/cliente")
@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarCliente(@RequestBody @Valid ClienteDTO cliente) {
        clienteService.cadastrarCliente(cliente);
    }


    @GetMapping
    public List<ClienteDTO> exibirListaDeClientes() {
        return clienteService.exibirListaDeClientes();

    }

    @GetMapping("/{cpf}")
    public ClienteDTO pesquisarClientePeloCPF(@PathVariable String cpf) {
        return clienteService.pesquisarClientePeloCPF(cpf);

    }


}

