package br.com.gabrieldev.projetocliente.projetocliente.domain.dto;

import br.com.gabrieldev.projetocliente.projetocliente.domain.Pedido;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
public class PedidoDTO {

    private String cliente;
    private LocalDate dataPedido;
    private BigDecimal total;

    public PedidoDTO(){

    }

    public PedidoDTO(Pedido pedido){
        cliente = pedido.getCliente().toString();
        dataPedido = pedido.getDataPedido();
        total = pedido.getTotal();
    }

}


