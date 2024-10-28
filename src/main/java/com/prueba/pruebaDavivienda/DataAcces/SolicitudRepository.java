package com.prueba.pruebaDavivienda.DataAcces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.pruebaDavivienda.Entity.Solicitud;

@Repository
public interface SolicitudRepository extends JpaRepository<Solicitud,Long>{
    List<Solicitud> findByPersona(Integer personaId);
}
