package com.config.spring.springweb_web001.controladores.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.config.spring.springweb_web001.modelos.dto.ParametroDTO;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/variable") /* ruta base para este controlador */
public class VartiableApiController {
  @Value("${app.mensaje}")
  // El valor de app.mensaje se inyectará en esta variable desde el archivo
  // application.properties.
  private String mensaje;
  @Value("${app.numero}")
  private int numero[];
  @Value("${app.booleano}")
  private boolean booleano;

  @GetMapping("/pagina1/{mensaje}")
  public ParametroDTO pagina1(@PathVariable String mensaje) {
    ParametroDTO parametro = new ParametroDTO(mensaje);

    return parametro;
  }

  @GetMapping("/pagina1")
  public ParametroDTO pagina1Defecto() {
    ParametroDTO parametro = new ParametroDTO("Mensaje por defecto");

    return parametro;
  }

  @GetMapping("/valores")
  public Map<String, Object> valores() {

    Map<String, Object> respuesta = Map.of(
        "Mensaje", mensaje,
        "Numeros", numero,
        "Booleano", booleano);
    // Otar forma de crear el mapa:
    // Map<String, Object> respuesta = new HashMap<>();
    // respuesta.put("Mensaje", mensaje); etc...

    return respuesta;
  }
}
