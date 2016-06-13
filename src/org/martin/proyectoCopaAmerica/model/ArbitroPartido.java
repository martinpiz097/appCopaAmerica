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
public class ArbitroPartido {

    private short id;
    private Partido partido;
    private Arbitro arbitro;
    private Posicion posicion;

    public ArbitroPartido(short id, Partido partido, Arbitro arbitro, Posicion posicion) {
        this.id = id;
        this.partido = partido;
        this.arbitro = arbitro;
        this.posicion = posicion;
    }

    public ArbitroPartido(Partido partido, Arbitro arbitro, Posicion posicion) {
        this.partido = partido;
        this.arbitro = arbitro;
        this.posicion = posicion;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
}
