package com.example.Quiz2corte.Controller;

import com.example.Quiz2corte.model.ReservaZona;
import com.example.Quiz2corte.Service.ReservaZonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("reservazona")
public class ReservaZonaController {

    @Autowired
    private ReservaZonaService service;

    @PostMapping
    public ReservaZona crear(@RequestBody ReservaZona reserva) {
        return service.guardar(reserva);
    }

    @GetMapping
    public List<ReservaZona> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ReservaZona buscar(@PathVariable Long id) {
        return service.buscarPorId(id).orElse(null);
    }
    // 1. Reservas de zona de un propietario
    @GetMapping("/por-propietario/{id}")
    public List<ReservaZona> obtenerPorPropietario(@PathVariable Long id) {
        return service.obtenerReservasPorPropietario(id);
    }
    // 4. Reservas de zona por fecha
    @GetMapping("/por-fecha")
    public List<ReservaZona> obtenerPorFecha(@RequestParam("fecha") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecha) {
        return service.obtenerReservasPorFecha(fecha);
    }

    @PutMapping
    public ReservaZona actualizar(@RequestBody ReservaZona reserva) {
        return service.actualizar(reserva);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
