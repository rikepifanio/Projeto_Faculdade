package com.example.ProjetoFaculdade.Service;

import com.example.ProjetoFaculdade.model.Cliente;
import com.example.ProjetoFaculdade.repository.RepositoryCliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    public final RepositoryCliente repositoryCliente;

    public ClienteService(RepositoryCliente repositoryCliente) {
        this.repositoryCliente = repositoryCliente;
    }

    public Cliente salvar(Cliente cliente){
        return repositoryCliente.save(cliente);
    }

    public List<Cliente> listar(){
        return repositoryCliente.findAll();
    }

    public Cliente buscar(Long id){return repositoryCliente.findById(id).orElse(null);}

    public void deletar(Long id){
        repositoryCliente.deleteById(id);
    }

    public Cliente modificar(Cliente cliente){return repositoryCliente.save(cliente);}
}
