package br.com.gabrieldev.projetocliente.projetocliente.repository;

import br.com.gabrieldev.projetocliente.projetocliente.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
