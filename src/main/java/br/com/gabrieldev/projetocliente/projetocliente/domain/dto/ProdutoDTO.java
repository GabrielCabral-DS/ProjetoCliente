package br.com.gabrieldev.projetocliente.projetocliente.domain.dto;

import br.com.gabrieldev.projetocliente.projetocliente.domain.Produto;

import java.math.BigDecimal;

public class ProdutoDTO {

    private Integer id;
    private String descricao;
    private BigDecimal preco;


    public ProdutoDTO(){

    }


    public ProdutoDTO(Produto produto){
        id = produto.getId();
        descricao = produto.getDescricao();
        preco = produto.getPreco();
    }
}
