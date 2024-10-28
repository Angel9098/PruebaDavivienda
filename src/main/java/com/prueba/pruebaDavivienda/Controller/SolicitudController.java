package com.prueba.pruebaDavivienda.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import com.prueba.pruebaDavivienda.Entity.Solicitud;
import com.prueba.pruebaDavivienda.Service.SolicitudService;

@RestController
@RequestMapping("/solicitud")
public class SolicitudController {
    
 @Autowired
    private SolicitudService solicitudService;

    @PostMapping()
    public ResponseEntity<Solicitud> crearSolicitud(@RequestBody Solicitud solicitud) {
        Solicitud nuevaSolicitud = solicitudService.crearSolicitud(solicitud);
        return ResponseEntity.status(201).body(nuevaSolicitud); 
    }

    @GetMapping("/cliente")
    public List<Solicitud> obtenerSolicitudesPorCliente(@RequestParam Integer personaId) {
        return solicitudService.obtenerSolicitudesPorCliente(personaId);
    }

    @PutMapping()
    public ResponseEntity<Solicitud> actualizarSolicitud(@RequestParam Long id, @RequestBody Solicitud solicitud) {
        Solicitud solicitudActualizada = solicitudService.actualizarSolicitud(id, solicitud);
        return ResponseEntity.ok(solicitudActualizada);
    }
     @GetMapping("/{id}")
    public ResponseEntity<Solicitud> obtenerSolicitud(@PathVariable Long id) {
        Optional<Solicitud> solicitud = solicitudService.obtenerSolicitudPorId(id);
        return solicitud.map(ResponseEntity::ok)
                        .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
