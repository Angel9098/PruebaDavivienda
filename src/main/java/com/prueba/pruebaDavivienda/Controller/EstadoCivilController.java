package com.prueba.pruebaDavivienda.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.prueba.pruebaDavivienda.Entity.EstadoCivil;
import com.prueba.pruebaDavivienda.Service.EstadoCivilService;

import java.util.List;
@RestController
@RequestMapping("/estado")
public class EstadoCivilController {

       @Autowired
    private EstadoCivilService estadoCivilService;

    @GetMapping("/civil")
    public List<EstadoCivil> getEstadoCivil() {
        return estadoCivilService.findAll();
    }
}
