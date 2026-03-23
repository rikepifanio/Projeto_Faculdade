package com.example.ProjetoFaculdade.repository;

import com.example.ProjetoFaculdade.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryPedido extends JpaRepository<Pedido, Long> {
}
