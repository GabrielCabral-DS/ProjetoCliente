package br.com.gabrieldev.projetocliente.projetocliente.domain;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Table(name = "PRODUTO")
@Entity
@Getter
@Setter
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "PRECO_UNITARIO")
    private BigDecimal preco;

    @OneToMany(mappedBy = "produto")
    private List<ItemPedido> itemPedidos;

    public Produto(){

    }

    public Produto(Integer id, String descricao, BigDecimal preco){
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

}
