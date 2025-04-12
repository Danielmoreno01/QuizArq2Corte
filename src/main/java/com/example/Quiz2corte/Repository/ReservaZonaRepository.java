package com.example.Quiz2corte.Repository;

import com.example.Quiz2corte.model.ReservaZona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

public interface ReservaZonaRepository extends JpaRepository<ReservaZona, Long> {

    // 1. Mostrar las reservas de la zona social que ha hecho un propietario
    @Query("SELECT rz FROM ReservaZona rz WHERE rz.propietario.id = :propietarioId")
    List<ReservaZona> findByPropietarioId(@Param("propietarioId") Long propietarioId);

    // 4. Mostrar reservas de zona por fecha
    @Query("SELECT rz FROM ReservaZona rz WHERE rz.fecha = :fecha")
    List<ReservaZona> findByFecha(@Param("fecha") LocalDate fecha);
}
