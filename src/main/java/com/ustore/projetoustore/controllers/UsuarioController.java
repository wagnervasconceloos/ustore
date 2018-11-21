package com.ustore.projetoustore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ustore.projetoustore.models.Usuario;
import com.ustore.projetoustore.repository.UsuarioRepository;
import com.ustore.projetoustore.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;
	
	@RequestMapping(value="/cadastrousuario", method=RequestMethod.GET)
	public String form() {
		return "usuario/cadastrousuario";
	}
	
	@RequestMapping(value="/cadastrousuario", method=RequestMethod.POST)
	public String salvar(Usuario usuario) {
		repository.save(usuario);
		return "redirect:/cadastrousuario";
	}
	
	@Autowired
    private UsuarioService usuarioService;
	
	@RequestMapping("/listar")
    @ResponseBody
    public ResponseEntity<List> getPeople() {
        return new ResponseEntity(usuarioService.getUsuario(), HttpStatus.OK);
    }

}
