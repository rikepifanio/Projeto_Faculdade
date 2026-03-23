package com.example.ProjetoFaculdade.repository;

import com.example.ProjetoFaculdade.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCliente extends JpaRepository<Cliente, Long> {
}
