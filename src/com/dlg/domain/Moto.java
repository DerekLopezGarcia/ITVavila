package com.dlg.domain;

import java.util.Date;

public class Moto implements Vehiculo{
    private String Matricula;
    private String Marca;
    private String Modelo;
    private String Color;
    private Date AnoMatricula;
    private Integer DiametroRuedas;

    public Integer getDiametroRuedas() {
        return DiametroRuedas;
    }

    public void setDiametroRuedas(Integer diametroRuedas) {
        DiametroRuedas = diametroRuedas;
    }

    @Override
    public String getMatricula() {
        return Matricula;
    }

    @Override
    public Void setMatricula(String matricula) {
        this.Matricula = matricula;
    }

    @Override
    public String getMarca() {
        return Marca;
    }

    @Override
    public Void setMarca(String marca) {
       this.Marca = marca;
    }

    @Override
    public String getModelo() {
        return Modelo;
    }

    @Override
    public Void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    @Override
    public String getColor() {
        return Color;
    }

    @Override
    public Void setColor(String color) {
        this.Color = color;
    }

    @Override
    public Void setAnoMatricula(Date anomatricula) {
        this.AnoMatricula = anomatricula;
    }

    @Override
    public Date getAnoMatricula() {
        return AnoMatricula;
    }
}
