package com.prueba.pruebaDavivienda.Entity;

import javax.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "solicitud")
@Data
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_solicitud")
    private Long idSolicitud;

    @JoinColumn(name = "id_persona",nullable = true)
    private Integer persona; 

    @Column(name = "fecha_creacion",nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    @Column(name = "monto",nullable = true)
    private Double monto;

    @Column(name = "plazo",nullable = true)
    private Integer plazo;

    @JoinColumn(name = "id_forma_pago",nullable = true)
    private Integer formaPago; 
}