package com.dlg.domain;

import java.util.Date;

public class Inspeccion {
    private String code;
    private Date Date;
    private Boolean Resultado;
    private String propietario;
    private String Matricula;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public Boolean getResultado() {
        return Resultado;
    }

    public void setResultado(Boolean resultado) {
        Resultado = resultado;
    }
    public void setPropietario(){
        this.propietario = Propietario.getDNI;
    }

    public String getPropietario() {
        return propietario;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula() {
    }
}
