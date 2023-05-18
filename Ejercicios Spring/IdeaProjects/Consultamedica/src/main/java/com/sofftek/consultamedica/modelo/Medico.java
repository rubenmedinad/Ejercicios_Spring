package com.sofftek.consultamedica.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "medico")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMedico;

    @Column(name="num_dni",length = 9,nullable = false)
    private String dni;

    @Column(name="nombre_medico",length = 100,nullable = false)
    private String nombre;

    @Column(nullable = false)
    private int edad;

    public Medico(){}

    public Medico(int idMedico, String dni, String nombre, int edad) {
    super();
    this.idMedico = idMedico;
    this.dni = dni;
    this.nombre = nombre;
    this.edad = edad;
    }


}
