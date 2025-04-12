package com.example.Quiz2corte.Controller;


import com.example.Quiz2corte.model.ReservaParqueadero;
import com.example.Quiz2corte.Service.ReservaParqueaderoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reservaparqueadero")
public class ReservaParqueaderoController {

    @Autowired
    private ReservaParqueaderoService service;

    @PostMapping
    public ReservaParqueadero crear(@RequestBody ReservaParqueadero reserva) {
        return service.guardar(reserva);
    }

    @GetMapping
    public List<ReservaParqueadero> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ReservaParqueadero buscar(@PathVariable Long id) {
        return service.buscarPorId(id).orElse(null);
    }

    @PutMapping
    public ReservaParqueadero actualizar(@RequestBody ReservaParqueadero reserva) {
        return service.actualizar(reserva);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
    // 3. Parqueaderos por propietario
    @GetMapping("/por-propietario/{id}")
    public List<ReservaParqueadero> obtenerPorPropietario(@PathVariable Long id) {
        return service.obtenerParqueaderosPorPropietario(id);
    }
}
