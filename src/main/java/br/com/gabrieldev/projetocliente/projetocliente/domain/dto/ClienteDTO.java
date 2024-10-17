package br.com.gabrieldev.projetocliente.projetocliente.domain.dto;

import br.com.gabrieldev.projetocliente.projetocliente.domain.Cliente;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ClienteDTO {

    private Integer id;
    private String nome;
    private String pedidos;



    public ClienteDTO(){

    }

    public  ClienteDTO (Cliente cliente){

        id = cliente.getId();
        nome = cliente.getNome();
        pedidos = cliente.getPedidos().toString();
    }
}
