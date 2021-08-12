package br.com.zup.Sistema_Loja.controlllers;

import br.com.zup.Sistema_Loja.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class ClienteController {

    @Autowired
    private ClienteService cliente;





}

