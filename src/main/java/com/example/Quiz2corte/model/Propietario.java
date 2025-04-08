package com.example.Quiz2corte.model;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
public class Propietario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPropietario;

    private String nombre;
    private String cedula;
    private Date fechaVisita;
    private Time horaEntrada;

    @OneToMany(mappedBy = "propietario")
    private List<Visitante> visitantes;

    @OneToMany(mappedBy = "propietario")
    private List<ReservaZona> reservasZona;

    @OneToMany(mappedBy = "propietario")
    private List<ReservaParqueadero> reservasParqueadero;

    public Propietario() {
    }

    public Propietario(Integer idPropietario, String nombre, String cedula, Date fechaVisita, Time horaEntrada, List<Visitante> visitantes, List<ReservaZona> reservasZona, List<ReservaParqueadero> reservasParqueadero) {
        this.idPropietario = idPropietario;
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaVisita = fechaVisita;
        this.horaEntrada = horaEntrada;
        this.visitantes = visitantes;
        this.reservasZona = reservasZona;
        this.reservasParqueadero = reservasParqueadero;
    }

    public Integer getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(Integer idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(Date fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public Time getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Time horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public List<Visitante> getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(List<Visitante> visitantes) {
        this.visitantes = visitantes;
    }

    public List<ReservaZona> getReservasZona() {
        return reservasZona;
    }

    public void setReservasZona(List<ReservaZona> reservasZona) {
        this.reservasZona = reservasZona;
    }

    public List<ReservaParqueadero> getReservasParqueadero() {
        return reservasParqueadero;
    }

    public void setReservasParqueadero(List<ReservaParqueadero> reservasParqueadero) {
        this.reservasParqueadero = reservasParqueadero;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "idPropietario=" + idPropietario +
                ", nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", fechaVisita=" + fechaVisita +
                ", horaEntrada=" + horaEntrada +
                ", visitantes=" + visitantes +
                ", reservasZona=" + reservasZona +
                ", reservasParqueadero=" + reservasParqueadero +
                '}';
    }
}
