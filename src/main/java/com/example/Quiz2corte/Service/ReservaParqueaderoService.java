package com.example.Quiz2corte.Service;


import com.example.Quiz2corte.model.ReservaParqueadero;
import com.example.Quiz2corte.Repository.ReservaParqueaderoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaParqueaderoService {

    @Autowired
    private ReservaParqueaderoRepository repository;

    public ReservaParqueadero guardar(ReservaParqueadero reserva) {
        return repository.save(reserva);
    }

    public List<ReservaParqueadero> listarTodos() {
        return repository.findAll();
    }

    public Optional<ReservaParqueadero> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public ReservaParqueadero actualizar(ReservaParqueadero reserva) {
        return repository.save(reserva);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
    public List<ReservaParqueadero> obtenerParqueaderosPorPropietario(Long id) {
        return repository.findByPropietarioId(id);
    }

}
