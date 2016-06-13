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
public class Entrenador {

    private byte id;
    private Rol rol;
    private Seleccion seleccion;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private byte edad;
    private Pais nacionalidad;
    private long sueldo;

    public Entrenador(byte id, Rol rol, Seleccion seleccion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, byte edad, Pais nacionalidad, long sueldo) {
        this.id = id;
        this.rol = rol;
        this.seleccion = seleccion;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.sueldo = sueldo;
    }

    public Entrenador(Rol rol, Seleccion seleccion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, byte edad, Pais nacionalidad, long sueldo) {
        this.rol = rol;
        this.seleccion = seleccion;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.sueldo = sueldo;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Seleccion getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
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

    public long getSueldo() {
        return sueldo;
    }

    public void setSueldo(long sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
