package com.example.Quiz2corte.Service;


import com.example.Quiz2corte.model.ReservaZona;
import com.example.Quiz2corte.Repository.ReservaZonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ReservaZonaService {

    @Autowired
    private ReservaZonaRepository repository;

    public ReservaZona guardar(ReservaZona reserva) {
        return repository.save(reserva);
    }

    public List<ReservaZona> listarTodos() {
        return repository.findAll();
    }

    public Optional<ReservaZona> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public ReservaZona actualizar(ReservaZona reserva) {
        return repository.save(reserva);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
    public List<ReservaZona> obtenerReservasPorPropietario(Long id) {
        return repository.findByPropietarioId(id);
    }

    public List<ReservaZona> obtenerReservasPorFecha(LocalDate fecha) {
        return repository.findByFecha(fecha);
    }

}
