    package com.example.Quiz2corte.Controller;

    import com.example.Quiz2corte.model.ZonaSocial;
    import com.example.Quiz2corte.Service.ZonaSocialService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    @RequestMapping("zonasSocial")
    public class ZonaSocialController {

        @Autowired
        private ZonaSocialService service;

        @PostMapping
        public ZonaSocial crear(@RequestBody ZonaSocial zona) {
            return service.guardar(zona);
        }

        @GetMapping
        public List<ZonaSocial> listar() {
            return service.listarTodos();
        }

        @GetMapping("/{id}")
        public ZonaSocial buscar(@PathVariable Long id) {
            return service.buscarPorId(id).orElse(null);
        }

        @PutMapping
        public ZonaSocial actualizar(@RequestBody ZonaSocial zona) {
            return service.actualizar(zona);
        }

        @DeleteMapping("/{id}")
        public void eliminar(@PathVariable Long id) {
            service.eliminar(id);
        }
    }
