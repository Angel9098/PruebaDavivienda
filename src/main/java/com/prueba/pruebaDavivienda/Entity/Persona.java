package com.prueba.pruebaDavivienda.Entity;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "persona")
@Data
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Long idPersona;

    @Column(name = "dui", nullable = true)
    private String dui;

    @Column(name = "nit", nullable = true)
    private String nit;

    @Column(name = "nombres", nullable = true)
    private String nombres;

    @Column(name = "apellidos", nullable = true)
    private String apellidos;

    @Column(name = "sexo", nullable = true)
    private String sexo;

    
    @JoinColumn(name = "id_actividad_economica", nullable = true)
    private Integer actividadEconomica; 

    
    @JoinColumn(name = "id_estado_civil", nullable = true)
    private Integer estadoCivil; 

}
