package com.prueba.pruebaDavivienda.Entity;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "estado_civil")
@Data
public class EstadoCivil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado_civil")
    private Long idEstadoCivil;

    @Column(name = "descripcion" ,nullable = true )
    private String descripcion;
}