package com.example.ProjetoFaculdade.controller;

import com.example.ProjetoFaculdade.Service.ClienteService;
import com.example.ProjetoFaculdade.Service.ProdutoService;
import com.example.ProjetoFaculdade.model.Cliente;
import com.example.ProjetoFaculdade.model.Pedido;
import com.example.ProjetoFaculdade.repository.RepositoryCliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    public final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente){
        return clienteService.salvar(cliente);
    }

    @GetMapping
    public List<Cliente> listar(Cliente cliente){return clienteService.listar();}

    @GetMapping("/{id}")
    public Cliente buscar(@PathVariable Long id){
        return clienteService.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
         clienteService.deletar(id);
    }

    @PutMapping("/{id}")
    public Cliente modificar(@RequestBody Cliente cliente){return clienteService.modificar(cliente);}


}
