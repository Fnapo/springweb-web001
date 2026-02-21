package com.config.spring.springweb_web001.modelos.dto;

public class ParametroDTO {
  private String informacion;

  public ParametroDTO() {
  }

  public ParametroDTO(String informacion) {
    this.informacion = informacion;
  }

  public String getInformacion() {
    return informacion;
  }

  public void setInformacion(String informacion) {
    this.informacion = informacion;
  }
}
