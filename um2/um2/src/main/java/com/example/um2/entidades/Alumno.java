package com.example.um2.entidades;

import com.example.um2.enumeraciones.Especialidades;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Setter
@SuperBuilder

public class Alumno extends Persona{

    private int legajo;

    private Especialidades especialidad;


}