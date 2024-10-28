package com.prueba.pruebaDavivienda.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.pruebaDavivienda.Entity.ActividadesEconomicas;
import com.prueba.pruebaDavivienda.Service.ActividadEconomicaService;

@RestController
@RequestMapping("/actividades")
public class ActivadEconomicaController {

     @Autowired
    private ActividadEconomicaService actividadesEconomicasService;

    @GetMapping("/economicas")
    public List<ActividadesEconomicas> getActividadesEconomicas() {
        return actividadesEconomicasService.findAll();
    }
}
