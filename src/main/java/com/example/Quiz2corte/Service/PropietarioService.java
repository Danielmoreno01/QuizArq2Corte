package com.example.Quiz2corte.Service;

import com.example.Quiz2corte.model.Propietario;
import com.example.Quiz2corte.Repository.PropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PropietarioService {

    @Autowired
    private PropietarioRepository repository;

    public Propietario guardar(Propietario propietario) {
        return repository.save(propietario);
    }

    public List<Propietario> listarTodos() {
        return repository.findAll();
    }

    public Optional<Propietario> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Propietario actualizar(Propietario propietario) {
        return repository.save(propietario);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
    public Optional<Propietario> obtenerConVisitantes(Long id) {
        return repository.findPropietarioConVisitantes(id);
    }

}
