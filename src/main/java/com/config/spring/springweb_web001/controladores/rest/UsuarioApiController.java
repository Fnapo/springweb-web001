package com.config.spring.springweb_web001.controladores.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.config.spring.springweb_web001.modelos.dto.UsuarioDTO;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioApiController {
  @GetMapping("/detalles")
  public UsuarioDTO detalles() {
    UsuarioDTO usuario = new UsuarioDTO("María López", "Administradora");

    return usuario;
  }

}
