package com.example.ProjetoFaculdade.repository;

import com.example.ProjetoFaculdade.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryProduto extends JpaRepository<Produto, Long> {
}
