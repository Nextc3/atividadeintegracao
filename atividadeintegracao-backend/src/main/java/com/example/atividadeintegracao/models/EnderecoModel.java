package com.example.atividadeintegracao.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_ENDERECO")
@Data

public class EnderecoModel implements Serializable {

    private UUID idUsuario;
    private String logradouro;
    private String complemento;
    private int numero;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;

}
