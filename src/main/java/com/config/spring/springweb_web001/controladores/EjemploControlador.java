package com.config.spring.springweb_web001.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjemploControlador {

  @GetMapping("/")
  public String saludo(Model model) {
    // inyección de datos al modelo para la vista
    model.addAttribute("Mensaje", "¡Hola, bienvenido a Spring Web!");
    model.addAttribute("Titulo", "Página de Detalles");
    model.addAttribute("Descripcion", "Esta es la página de detalles.");

    /*
     * otra forma de inyectar datos al modelo usando un Map:
     * public String saludo(Map<String, Object> model) {
     * model.put("Mensaje", "¡Hola, bienvenido a Spring Web!");
     * model.put("Titulo", "Página de Detalles");
     * model.put("Descripcion", "Esta es la página de detalles.");
     */
    return "detalles"; /* nombre de la plantilla HTML sin la extensión .html */
  }
}
