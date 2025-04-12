package com.example.Quiz2corte.Controller;


import com.example.Quiz2corte.model.Visitante;
import com.example.Quiz2corte.Service.VisitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("visitantes")
public class VisitanteController {

    @Autowired
    private VisitanteService service;

    @PostMapping
    public Visitante crear(@RequestBody Visitante visitante) {
        return service.guardar(visitante);
    }

    @GetMapping
    public List<Visitante> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Visitante buscar(@PathVariable Long id) {
        return service.buscarPorId(id).orElse(null);
    }

    @PutMapping
    public Visitante actualizar(@RequestBody Visitante visitante) {
        return service.actualizar(visitante);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}

