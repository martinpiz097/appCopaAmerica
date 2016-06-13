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
public class Seleccion {
    
    private byte id;
    private String nombre;
    private byte cantJugadores;
    private Estado estado;
    private Pais pais;
    private int lugarFifa;
    private Fase faseActual; 

    public Seleccion(byte id, String nombre, byte cantJugadores, Estado estado, Pais pais, int lugarFifa, Fase faseActual) {
        this.id = id;
        this.nombre = nombre;
        this.cantJugadores = cantJugadores;
        this.estado = estado;
        this.pais = pais;
        this.lugarFifa = lugarFifa;
        this.faseActual = faseActual;
    }

    public Seleccion(String nombre, byte cantJugadores, Estado estado, Pais pais, int lugarFifa, Fase faseActual) {
        this.nombre = nombre;
        this.cantJugadores = cantJugadores;
        this.estado = estado;
        this.pais = pais;
        this.lugarFifa = lugarFifa;
        this.faseActual = faseActual;
    }
    
}
