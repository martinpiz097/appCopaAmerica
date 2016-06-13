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
public class CentroDeportivo {
    
    private byte id;
    private String nombre;
    private Seleccion seleccion;
    private String direccion;

    public CentroDeportivo(byte id, String nombre, Seleccion seleccion, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.seleccion = seleccion;
        this.direccion = direccion;
    }

    public CentroDeportivo(String nombre, Seleccion seleccion, String direccion) {
        this.nombre = nombre;
        this.seleccion = seleccion;
        this.direccion = direccion;
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

    public Seleccion getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
