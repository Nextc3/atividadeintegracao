package com.example.atividadeintegracao.dtos;

import com.example.atividadeintegracao.models.EnderecoModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.Date;

public record UsuarioRecordDto(@NotBlank String email, @NotNull String senha, @NotBlank String cpf, Date dataCriacao, Date dataAtualizacao, Date dataNascimento, @NotNull String nome, EnderecoModel endereco, ArrayList<String> telefones, String perfil) {
}
