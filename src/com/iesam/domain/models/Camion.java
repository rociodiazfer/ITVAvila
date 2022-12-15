package com.iesam.domain.models;

public class Camion implements Vehiculo{


    private String codCamion;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private String añoM;
    private Integer tara;
    private Integer longitud;



    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAñoM(String añoM) {
        this.añoM = añoM;
    }

    public Integer getTara() {
        return tara;
    }

    public void setTara(Integer tara) {
        this.tara = tara;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public void setCodCamion(String codCamion) {
        this.codCamion = codCamion;
    }

    @Override
    public String getCodVehiculo() {
        return codCamion;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getAñoM() {
        return añoM;
    }
}
