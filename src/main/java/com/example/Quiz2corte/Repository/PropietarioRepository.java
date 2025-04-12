
package com.example.Quiz2corte.Repository;
import com.example.Quiz2corte.model.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface PropietarioRepository extends JpaRepository<Propietario, Long> {

    // 2. Listar el propietario con los visitantes que ha tenido
    @Query("SELECT p FROM Propietario p LEFT JOIN FETCH p.visitantes WHERE p.id = :propietarioId")
    Optional<Propietario> findPropietarioConVisitantes(@Param("propietarioId") Long propietarioId);
}
