package com.prueba.pruebaDavivienda.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import com.prueba.pruebaDavivienda.DataAcces.SolicitudRepository;
import com.prueba.pruebaDavivienda.Entity.Solicitud;

@Service
public class SolicitudService {

      @Autowired
    private SolicitudRepository solicitudRepository;

    public Solicitud crearSolicitud(Solicitud solicitud) {
        solicitud.setFechaCreacion(new Date());
        return solicitudRepository.save(solicitud);
    }

    public List<Solicitud> obtenerSolicitudesPorCliente(Integer personaId) {
        return solicitudRepository.findByPersona(personaId);
    }

    public Solicitud actualizarSolicitud(Long id, Solicitud solicitud) {
        Optional<Solicitud> existente = solicitudRepository.findById(id);
        if (existente.isPresent()) {
            Solicitud solicitudActual = existente.get();
            solicitudActual.setMonto(solicitud.getMonto());
            solicitudActual.setPlazo(solicitud.getPlazo());
            solicitudActual.setFormaPago(solicitud.getFormaPago());
            solicitudActual.setPersona(solicitud.getPersona()); 
            return solicitudRepository.save(solicitudActual);
        } else {
            throw new RuntimeException("Solicitud no encontrada");
        }
    }
    public Optional<Solicitud> obtenerSolicitudPorId(Long id) {
        return solicitudRepository.findById(id);
    }
}
