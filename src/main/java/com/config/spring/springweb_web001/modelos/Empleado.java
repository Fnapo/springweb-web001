package com.config.spring.springweb_web001.modelos;

public class Empleado {
  private String nombre;
  private String puesto;
  private String direccion;
  private double salario;
  private int id;

  public Empleado(String nombre, String direccion, String puesto, double salario, int id) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.puesto = puesto;
    this.salario = salario;
    this.id = id;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getPuesto() {
    return puesto;
  }

  public void setPuesto(String puesto) {
    this.puesto = puesto;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}
