package br.com.gabrieldev.projetocliente.projetocliente.domain.dto;

import br.com.gabrieldev.projetocliente.projetocliente.domain.ItemPedido;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItemPedidoDTO {

    private String pedido;
    private String produto;
    private Integer quantidade;

    public ItemPedidoDTO(){

    }

    public ItemPedidoDTO(ItemPedido itemPedido){
        pedido = itemPedido.getPedido().toString();
        produto = itemPedido.getProduto().toString();
        quantidade = itemPedido.getQuantidade();
    }
}
