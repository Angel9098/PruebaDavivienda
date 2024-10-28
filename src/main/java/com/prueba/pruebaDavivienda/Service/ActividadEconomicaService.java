package com.prueba.pruebaDavivienda.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.pruebaDavivienda.DataAcces.ActividadEconomicaRepository;
import com.prueba.pruebaDavivienda.Entity.ActividadesEconomicas;

@Service
public class ActividadEconomicaService {

    @Autowired
    private ActividadEconomicaRepository actividadEconomicaRepository;

    public List<ActividadesEconomicas> findAll() {
        return actividadEconomicaRepository.findAll();
    }
}
