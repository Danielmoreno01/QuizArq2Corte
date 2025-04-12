package com.example.Quiz2corte.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class ZonaSocial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idZona;

    private String nombre;

    @OneToMany(mappedBy = "zona", cascade = CascadeType.ALL)
    private List<ReservaZona> reservasZona;

    public ZonaSocial() {
    }

    public ZonaSocial(Long idZona, String nombre, List<ReservaZona> reservasZona) {
        this.idZona = idZona;
        this.nombre = nombre;
        this.reservasZona = reservasZona;
    }

    public Long getIdZona() {
        return idZona;
    }

    public void setIdZona(Long idZona) {
        this.idZona = idZona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<ReservaZona> getReservasZona() {
        return reservasZona;
    }

    public void setReservasZona(List<ReservaZona> reservasZona) {
        this.reservasZona = reservasZona;
    }

    @Override
    public String toString() {
        return "ZonaSocial{" +
                "idZona=" + idZona +
                ", nombre='" + nombre + '\'' +
                ", reservasZona=" + reservasZona +
                '}';
    }
}
