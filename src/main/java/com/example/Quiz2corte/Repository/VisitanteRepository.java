package com.example.Quiz2corte.Repository;

import com.example.Quiz2corte.model.Visitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VisitanteRepository extends JpaRepository<Visitante, Long> {

    @Query(value = """
        SELECT p.id_propietario, p.nombre AS nombre_propietario, 
               v.id_visitante, v.nombre AS nombre_visitante, 
               v.cedula, v.correo, v.telefono
        FROM propietario p
        JOIN visitante v ON p.id_propietario = v.id_propietario
        WHERE p.id_propietario = :idPropietario
    """, nativeQuery = true)
    List<Object[]> findVisitantesByPropietario(@Param("idPropietario") Long idPropietario);
}
