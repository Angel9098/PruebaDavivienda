package com.prueba.pruebaDavivienda.DataAcces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.pruebaDavivienda.Entity.Persona;

@Repository
public interface ClienteRepository extends JpaRepository<Persona, Long> {
}