package com.example.Quiz2corte.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ZonaSocial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idZona;

    private String nombre;
    private String ubicacion;
    private Integer capacidad;

    @OneToMany(mappedBy = "zona")
    private List<ReservaZona> reservas;

    public ZonaSocial() {
    }

    public ZonaSocial(Integer idZona, String nombre, String ubicacion, Integer capacidad, List<ReservaZona> reservas) {
        this.idZona = idZona;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.reservas = reservas;
    }

    public Integer getIdZona() {
        return idZona;
    }

    public void setIdZona(Integer idZona) {
        this.idZona = idZona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public List<ReservaZona> getReservas() {
        return reservas;
    }

    public void setReservas(List<ReservaZona> reservas) {
        this.reservas = reservas;
    }

    @Override
    public String toString() {
        return "ZonaSocial{" +
                "idZona=" + idZona +
                ", nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", capacidad=" + capacidad +
                ", reservas=" + reservas +
                '}';
    }
}
