package com.iesam.domain.models;

public class Inspeccion {

    private String codInspeccion;
    private String fechaInspeccion;
    private boolean resultado;
    private Vehiculo vehiculo;
    private Propietario propietario;

    public String getCodInspeccion(int i) {
        return codInspeccion;
    }

    public void setCodInspeccion(String codInspeccion) {
        this.codInspeccion = codInspeccion;
    }

    public String getFechaInspeccion(String s) {
        return fechaInspeccion;
    }

    public void setFechaInspeccion(String fechaInspeccion) {
        this.fechaInspeccion = fechaInspeccion;
    }

    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}
