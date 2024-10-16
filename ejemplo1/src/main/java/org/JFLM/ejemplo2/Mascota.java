package org.JFLM.ejemplo2;

import java.time.*;

import javax.persistence.*;

@Entity // Esta anotación marca a Mascota como una entidad JPA
public class Mascota {

    @Id // Indica que este campo es el identificador único (Primary Key)
    @GeneratedValue(strategy = GenerationType.AUTO) // Autogenerar el ID
    private Long id;

    private String nombre;
    private String descripcion;
    private String raza;
    private LocalDate fechaNacimiento;

    // Constructor vacío
    public Mascota() {
    }

    // Constructor con parámetros
    public Mascota(String nombre, String descripcion, String raza, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
