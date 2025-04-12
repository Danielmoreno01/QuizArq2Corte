package com.example.Quiz2corte.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class ReservaParqueadero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;

    private LocalDate fecha;
    private LocalTime horaInicio;

    @ManyToOne
    @JoinColumn(name = "id_propietario")
    private Propietario propietario;

    public ReservaParqueadero() {
    }

    public ReservaParqueadero(Long idReserva, LocalDate fecha, LocalTime horaInicio, Propietario propietario) {
        this.idReserva = idReserva;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.propietario = propietario;
    }

    public Long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Long idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "ReservaParqueadero{" +
                "idReserva=" + idReserva +
                ", fecha=" + fecha +
                ", horaInicio=" + horaInicio +
                ", propietario=" + propietario +
                '}';
    }
}
