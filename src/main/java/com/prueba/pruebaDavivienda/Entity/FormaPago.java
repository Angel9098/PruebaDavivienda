package com.prueba.pruebaDavivienda.Entity;

import javax.persistence.*;

import lombok.Data;


@Entity
@Table(name = "forma_pago")
@Data
public class FormaPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_forma_pago")
    private Long idFormaPago;

    @Column(name = "descripcion" , nullable = true)
    private String descripcion;
}
