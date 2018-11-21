package com.ustore.projetoustore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustore.projetoustore.models.Usuario;
import com.ustore.projetoustore.repository.UsuarioRepository;

@Service
public class UsuarioService {
 
    @Autowired
    private UsuarioRepository repository;
 
    public Iterable<Usuario> getUsuario() {
        return repository.findAll();
    }
}