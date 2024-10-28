package com.prueba.pruebaDavivienda.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.prueba.pruebaDavivienda.DataAcces.EstadoCivilRepository;
import com.prueba.pruebaDavivienda.Entity.EstadoCivil;

@Service
public class EstadoCivilService {
       @Autowired
    private EstadoCivilRepository estadoCivilRepository;

   public List<EstadoCivil> findAll() {
        return estadoCivilRepository.findAll();
    }
}
