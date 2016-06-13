/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.martin.proyectoCopaAmerica.model;

/**
 *
 * @author LAB-315
 */
public class Fase {

    private byte id;
    private String nombre;

    public Fase(byte id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Fase(String nombre) {
        this.nombre = nombre;
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
    
    
}
