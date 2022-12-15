package com.dlg.domain;

import java.util.Date;

public interface Vehiculo {
 public String getMatricula();
 public Void setMatricula(String matricula);
 public String getMarca();
 public Void setMarca(String marca);
 public String getModelo();
 public Void setModelo(String modelo);
 public String getColor();
 public Void setColor(String color);
 public Void setAnoMatricula(Date anomatricula);
 public Date getAnoMatricula();

}
