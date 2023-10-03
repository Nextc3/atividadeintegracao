package com.example.atividadeintegracao.controller;

import com.example.atividadeintegracao.dtos.UsuarioRecordDto;
import com.example.atividadeintegracao.models.UsuarioModel;
import com.example.atividadeintegracao.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping("/usuario")
    public ResponseEntity<UsuarioModel> save(@RequestBody @Valid UsuarioRecordDto usuarioRecordDto){
        var usuarioModel = new UsuarioModel();
        BeanUtils.copyProperties(usuarioRecordDto, usuarioModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioRepository.save(usuarioModel));
    }
}
