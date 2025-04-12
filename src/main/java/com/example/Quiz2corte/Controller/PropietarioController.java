package com.example.Quiz2corte.Controller;

import com.example.Quiz2corte.model.Propietario;
import com.example.Quiz2corte.Service.PropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("propietarios")
public class PropietarioController {

    @Autowired
    private PropietarioService service;

    @PostMapping
    public Propietario crear(@RequestBody Propietario propietario) {
        return service.guardar(propietario);
    }



    @GetMapping
    public List<Propietario> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Propietario buscar(@PathVariable Long id) {
        return service.buscarPorId(id).orElse(null);
    }

    @PutMapping
    public Propietario actualizar(@RequestBody Propietario propietario) {
        return service.actualizar(propietario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
    // 2. Propietario con sus visitantes
    @GetMapping("/{id}/visitantes")
    public Optional<Propietario> obtenerConVisitantes(@PathVariable Long id) {
        return service.obtenerConVisitantes(id);
    }

}
