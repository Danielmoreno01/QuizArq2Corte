package com.example.Quiz2corte.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

import java.sql.Time;
import java.util.Date;

@Entity
public class ReservaZona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReserva;

    private Date fecha;
    private Time horaInicio;

    @ManyToOne
    @JoinColumn(name = "id_zona")
    private ZonaSocial zona;

    @ManyToOne
    @JoinColumn(name = "id_propietario")
    private Propietario propietario;

    public ReservaZona() {
    }

    public ReservaZona(Integer idReserva, Date fecha, Time horaInicio, ZonaSocial zona, Propietario propietario) {
        this.idReserva = idReserva;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.zona = zona;
        this.propietario = propietario;
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public ZonaSocial getZona() {
        return zona;
    }

    public void setZona(ZonaSocial zona) {
        this.zona = zona;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "ReservaZona{" +
                "idReserva=" + idReserva +
                ", fecha=" + fecha +
                ", horaInicio=" + horaInicio +
                ", zona=" + zona +
                ", propietario=" + propietario +
                '}';
    }
}



