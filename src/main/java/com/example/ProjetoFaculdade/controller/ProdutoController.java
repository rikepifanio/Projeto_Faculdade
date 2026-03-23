package com.example.ProjetoFaculdade.controller;

import com.example.ProjetoFaculdade.Service.ProdutoService;
import com.example.ProjetoFaculdade.model.Cliente;
import com.example.ProjetoFaculdade.model.Pedido;
import com.example.ProjetoFaculdade.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    public final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public Produto criar(@RequestBody Produto produto){
        return produtoService.salvar(produto);
    }

    @GetMapping
    public List<Produto> listar(Cliente cliente){return produtoService.listar();}

    @GetMapping("/{id}")
    public Produto buscar(@PathVariable Long id){
        return produtoService.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        produtoService.deletar(id);
    }

    @PutMapping("/{id}")
    public Produto modificar(@RequestBody Produto produto){return produtoService.modificar(produto);}

}
