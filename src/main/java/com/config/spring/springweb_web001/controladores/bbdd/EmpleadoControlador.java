package com.config.spring.springweb_web001.controladores.bbdd;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.config.spring.springweb_web001.modelos.Empleado;

@Controller
@RequestMapping("/empleados") /* ruta base para este controlador */
public class EmpleadoControlador {
  @GetMapping("/detalles")
  public String detalles(Model model) {
    Empleado empleado = new Empleado("Juan Pérez", null, "Desarrollador", 50000.0, 123);

    model.addAttribute("empleado", empleado);
    // inyección de datos al modelo para la vista

    return "empleados/detalles"; /* nombre de la plantilla HTML sin la extensión .html */
  }

  @ModelAttribute("empleados")
  // Sirve para agregar un atributo común a todas las vistas manejadas por este
  // controlador
  public Iterable<Empleado> empleados() {
    return java.util.List.of(
        new Empleado("Juan Pérez", "Calle Principal 123", "Desarrollador", 50000.0, 123),
        new Empleado("María García", "Avenida Central 456", "Diseñadora", 45000.0, 456),
        new Empleado("Carlos López", "Plaza Mayor 789", "Gerente", 60000.0, 789));
  }

}
