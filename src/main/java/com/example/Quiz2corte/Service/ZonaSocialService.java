package com.example.Quiz2corte.Service;


import com.example.Quiz2corte.model.ZonaSocial;
import com.example.Quiz2corte.Repository.ZonaSocialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZonaSocialService {

    @Autowired
    private ZonaSocialRepository repository;

    public ZonaSocial guardar(ZonaSocial zona) {
        return repository.save(zona);
    }

    public List<ZonaSocial> listarTodos() {
        return repository.findAll();
    }

    public Optional<ZonaSocial> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public ZonaSocial actualizar(ZonaSocial zona) {
        return repository.save(zona);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }

}
