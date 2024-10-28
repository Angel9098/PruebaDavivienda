package com.prueba.pruebaDavivienda.DataAcces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.pruebaDavivienda.Entity.ActividadesEconomicas;

@Repository
public interface ActividadEconomicaRepository extends JpaRepository<ActividadesEconomicas, Long> {

}
