package com.example.atividadeintegracao.repository;

import com.example.atividadeintegracao.models.EnderecoModel;
import com.example.atividadeintegracao.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EnderecoRepository extends JpaRepository<EnderecoModel, UUID> {
}
