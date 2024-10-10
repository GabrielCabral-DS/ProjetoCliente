package br.com.gabrieldev.projetocliente.projetocliente.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Table(name = "ITEM_PEDIDO")
@Entity
@Getter
@Setter
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "PEDIDO_ID")
    private Pedido pedido;
    @ManyToOne
    @JoinColumn(name = "PRODUTO_ID")
    private Produto produto;
    @Column(name = "QUANTIDADE")
    private Integer quantidade;

    public ItemPedido(){

    }

    public ItemPedido(Integer id, Pedido pedido, Produto produto, Integer quantidade){
        this.id = id;
        this.pedido = pedido;
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
