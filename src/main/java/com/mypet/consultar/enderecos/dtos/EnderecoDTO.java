package com.mypet.consultar.enderecos.dtos;

import lombok.Data;

@Data
public class EnderecoDTO {
    private long id;
    private Long pessoaId;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String pais = "Brasil";
    private String tipoDePessoa;
    private String logradouro;
    private String localidade;
    private String uf;
    private String tipoDeEndereco;
}
