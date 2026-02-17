package com.config.spring.springweb_web001.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.config.spring.springweb_web001.modelos.Empleado;

@Controller
@RequestMapping("/empleados") /* ruta base para este controlador */
public class EmpleadoControlador {
  @GetMapping("/detalles")
  public String detalles(Model model) {
    Empleado empleado = new Empleado("Juan Pérez", "Desarrollador", 50000.0, 123);

    model.addAttribute("empleado", empleado);
    // inyección de datos al modelo para la vista

    return "empleados/detalles"; /* nombre de la plantilla HTML sin la extensión .html */
  }

}
