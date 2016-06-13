/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.martin.proyectoCopaAmerica.model;

/**
 *
 * @author martin
 */
public class Arbitro {

    private byte id;
    private String nombre;
    private String apellido;
    private byte edad;
    private Pais nacionalidad;

    public Arbitro(byte id, String nombre, String apellido, byte edad, Pais nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public Arbitro(String nombre, String apellido, byte edad, Pais nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public Pais getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Pais nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
