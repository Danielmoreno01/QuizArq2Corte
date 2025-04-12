package com.example.Quiz2corte.Repository;

import com.example.Quiz2corte.model.ReservaParqueadero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ReservaParqueaderoRepository extends JpaRepository<ReservaParqueadero, Long> {

    // 3. Listar parqueaderos que tiene asignado un propietario
    @Query("SELECT rp FROM ReservaParqueadero rp WHERE rp.propietario.id = :propietarioId")
    List<ReservaParqueadero> findByPropietarioId(@Param("propietarioId") Long propietarioId);
}
