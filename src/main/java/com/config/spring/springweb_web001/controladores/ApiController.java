package com.config.spring.springweb_web001.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")

public class ApiController {
  @GetMapping("/detalles")
  public Map<String, Object> detalles() {
    Map<String, Object> respuesta = new HashMap<>();
    List<Integer> lista = Arrays.asList(115, 121, 133);

    respuesta.put("titulo", "Bienvenido a la API REST");
    respuesta.put("mensaje", "Este es un ejemplo de respuesta desde el controlador API.");
    respuesta.put("valor", lista);

    return respuesta;
  }

}
