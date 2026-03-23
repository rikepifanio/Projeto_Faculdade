package com.example.ProjetoFaculdade.Service;

import com.example.ProjetoFaculdade.model.Cliente;
import com.example.ProjetoFaculdade.model.Pedido;
import com.example.ProjetoFaculdade.model.Produto;
import com.example.ProjetoFaculdade.repository.RepositoryProduto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    public final RepositoryProduto repositoryProduto;

    public ProdutoService(RepositoryProduto repositoryProduto) {
        this.repositoryProduto = repositoryProduto;
    }

    public Produto salvar(Produto produto ){
        return repositoryProduto.save(produto);
    }

    public List<Produto> listar(){
        return repositoryProduto.findAll();
    }

    public Produto buscar(Long id){
        return repositoryProduto.findById(id).orElse(null);
    }

    public void deletar (Long id){
        repositoryProduto.deleteById(id);
    }

    public Produto modificar(Produto produto){return repositoryProduto.save(produto);}



}
