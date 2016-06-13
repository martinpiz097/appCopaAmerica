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

    public byte getCantJugadores() {
        return cantJugadores;
    }

    public void setCantJugadores(byte cantJugadores) {
        this.cantJugadores = cantJugadores;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getLugarFifa() {
        return lugarFifa;
    }

    public void setLugarFifa(int lugarFifa) {
        this.lugarFifa = lugarFifa;
    }

    public Fase getFaseActual() {
        return faseActual;
    }

    public void setFaseActual(Fase faseActual) {
        this.faseActual = faseActual;
    }
    
    
}
