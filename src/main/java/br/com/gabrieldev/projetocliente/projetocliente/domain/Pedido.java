package br.com.gabrieldev.projetocliente.projetocliente.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Table(name = "PEDIDO")
@Entity
@Getter
@Setter
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "CLIENTE_ID")
    private Cliente cliente;
    @Column(name = "DATA_PEDIDO")
    private LocalDate dataPedido;
    @Column(name = "TOTAL", scale = 2, precision = 20)
    private BigDecimal total;

    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itemPedidos;

    public Pedido(){

    }

    public Pedido(Integer id, Cliente cliente, LocalDate dataPedido, BigDecimal total){
        this.id = id;
        this.cliente = cliente;
        this.dataPedido = dataPedido;
        this.total = total;
    }
}
