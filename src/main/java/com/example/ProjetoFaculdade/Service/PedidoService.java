package com.example.ProjetoFaculdade.Service;

import com.example.ProjetoFaculdade.model.Cliente;
import com.example.ProjetoFaculdade.model.Pedido;
import com.example.ProjetoFaculdade.repository.RepositoryPedido;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    public final RepositoryPedido repositoryPedido;

    public PedidoService(RepositoryPedido repositoryPedido) {
        this.repositoryPedido = repositoryPedido;
    }

    public Pedido salvar(Pedido pedido ){
        return repositoryPedido.save(pedido);
    }

    public List<Pedido> listar(){
        return repositoryPedido.findAll();
    }

    public Pedido buscar(Long id){
        return repositoryPedido.findById(id).orElse(null);
    }

    public void deletar (Long id){
        repositoryPedido.deleteById(id);
    }

    public Pedido modificar(Pedido pedido){return repositoryPedido.save(pedido);}

}
