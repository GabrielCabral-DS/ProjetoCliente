package br.com.gabrieldev.projetocliente.projetocliente.repository;

import br.com.gabrieldev.projetocliente.projetocliente.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
