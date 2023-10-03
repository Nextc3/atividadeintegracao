package com.example.atividadeintegracao.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.core.SpringVersion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "TB_USUARIO")
@Data
public class UsuarioModel implements Serializable {
    private static final long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idUsuario;

    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private Date dataCriacao;
    private Date dataAtualizacao;
    private Date dataNascimento;
    private EnderecoModel endereco;
    private ArrayList<String> telefones;
    private String perfil;



}
