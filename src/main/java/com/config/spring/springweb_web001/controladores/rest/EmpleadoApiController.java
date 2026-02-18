package com.config.spring.springweb_web001.controladores.rest;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.config.spring.springweb_web001.modelos.Empleado;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoApiController {
  @GetMapping("/detalles")
  public Map<String, Empleado> detalles() {
    Map<String, Empleado> respuesta = Map.of(
        "empleado1", new Empleado("Juan Pérez", "Calle Principal 123", "Desarrollador", 50000.0, 123));

    return respuesta;
  }

}
