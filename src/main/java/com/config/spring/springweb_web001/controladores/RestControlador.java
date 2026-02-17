package com.config.spring.springweb_web001.controladores;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class RestControlador {

  @GetMapping("/detalles")
  public Map<String, Object> infoString() {
    Map<String, Object> respuesta = new HashMap<>();

    respuesta.put("Titulo", "Bienvenido a la API REST");
    respuesta.put("Descripcion", "Esta es una respuesta JSON desde el controlador REST.");
    respuesta.put("Mensaje", "¡Hola, bienvenido a Spring Web!");

    return respuesta;
  }

}
