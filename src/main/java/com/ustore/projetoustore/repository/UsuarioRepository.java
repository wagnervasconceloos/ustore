package com.ustore.projetoustore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ustore.projetoustore.models.Usuario;

@Repository
@Transactional
public interface UsuarioRepository extends CrudRepository<Usuario, String> {

	
}