package com.example.Quiz2corte.Service;

import com.example.Quiz2corte.model.Visitante;
import com.example.Quiz2corte.Repository.VisitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VisitanteService {

    @Autowired
    private VisitanteRepository repository;

    public Visitante guardar(Visitante visitante) {
        return repository.save(visitante);
    }

    public List<Visitante> listarTodos() {
        return repository.findAll();
    }

    public Optional<Visitante> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Visitante actualizar(Visitante visitante) {
        return repository.save(visitante);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
