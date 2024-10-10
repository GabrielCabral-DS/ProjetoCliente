package br.com.gabrieldev.projetocliente.projetocliente.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Table(name = "CLIENTE")
@Entity
@Getter
@Setter
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NOME")
    private String nome;

    @OneToMany(mappedBy = "cliente")
    private Set<Pedido> pedidos;

    public Cliente() {

    }

    public Cliente(String nome, Integer id) {
        this.id = id;
        this.nome = nome;
    }

}
