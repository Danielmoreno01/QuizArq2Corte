package com.example.Quiz2corte.Repository;


import com.example.Quiz2corte.model.ZonaSocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZonaSocialRepository extends JpaRepository<ZonaSocial, Long> {
    // Puedes agregar filtros por tipo, capacidad, etc.
}
