package com.campanha.pedidos.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.campanha.pedidos.model.Pedidos;
import com.campanha.pedidos.repository.PedidoRepository;

@RestController
@RequestMapping("/pedidos")

public class PedidoController  {
    @Autowired
    private PedidoRepository repository;

    // Criar pedido

    @PostMapping
    public Pedidos salvar(@RequestParam String nome,
                          @RequestParam String telefone,
                          @RequestParam int quantidade) {

        Pedidos pedido = new Pedidos();
        pedido.setNomeCliente(nome);
        pedido.setTelefone(telefone);
        pedido.setQuantidadePao(quantidade);

        return repository.save(pedido);
    }

    // Listar todos
    @GetMapping
    public List<Pedidos> listar() {
        return repository.findAll();
    }

    // Deletar
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
