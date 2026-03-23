package com.example.ProjetoFaculdade.controller;

import com.example.ProjetoFaculdade.Service.PedidoService;
import com.example.ProjetoFaculdade.model.Cliente;
import com.example.ProjetoFaculdade.model.Pedido;
import com.example.ProjetoFaculdade.model.Produto;
import com.example.ProjetoFaculdade.repository.RepositoryPedido;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
    public final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public Pedido criar(@RequestBody Pedido pedido){
        return pedidoService.salvar(pedido);
    }

    @GetMapping
    public List<Pedido> listar(Cliente cliente){return pedidoService.listar();}

    @GetMapping("/{id}")
    public Pedido buscar(@PathVariable Long id){
        return pedidoService.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        pedidoService.deletar(id);
    }

    @PutMapping("/{id}")
    public Pedido modificar(@RequestBody Pedido pedido){return pedidoService.modificar(pedido);}


}
