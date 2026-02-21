package com.config.spring.springweb_web001.controladores.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.config.spring.springweb_web001.modelos.dto.ParametroDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/parametros") /* ruta base para este controlador */
public class ParametroApiController {

  @GetMapping("/detalle")
  public ParametroDTO ObtenerInformacion(@RequestParam(defaultValue = "Hola a Todos") String informacion) {
    ParametroDTO parametro = new ParametroDTO(informacion);

    return parametro;
  }

}
