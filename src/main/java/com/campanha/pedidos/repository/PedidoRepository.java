package com.campanha.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.campanha.pedidos.model.Pedidos;

public interface PedidoRepository extends JpaRepository<Pedidos, Long> {
}