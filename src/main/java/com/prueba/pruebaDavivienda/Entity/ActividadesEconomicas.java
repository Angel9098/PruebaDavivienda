package com.prueba.pruebaDavivienda.Entity;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "actividades_economicas")
@Data
public class ActividadesEconomicas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_actividad_economica")
    private Long idActividadEconomica;

    @Column(name = "descripcion", nullable = true)
    private String descripcion;

}