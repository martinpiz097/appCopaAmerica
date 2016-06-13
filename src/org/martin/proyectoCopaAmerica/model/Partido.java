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
public class Partido {
 
    private short id;
    private String fecha;
    private Seleccion local;
    private Seleccion visita;
    private Estadio estadio;
    private String horaInicio;
    private String horaTermino;
    private int cantidadAsistentes;

    public Partido(short id, String fecha, Seleccion local, Seleccion visita, Estadio estadio, String horaInicio, String horaTermino, int cantidadAsistentes) {
        this.id = id;
        this.fecha = fecha;
        this.local = local;
        this.visita = visita;
        this.estadio = estadio;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public Partido(String fecha, Seleccion local, Seleccion visita, Estadio estadio, String horaInicio, String horaTermino, int cantidadAsistentes) {
        this.fecha = fecha;
        this.local = local;
        this.visita = visita;
        this.estadio = estadio;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Seleccion getLocal() {
        return local;
    }

    public void setLocal(Seleccion local) {
        this.local = local;
    }

    public Seleccion getVisita() {
        return visita;
    }

    public void setVisita(Seleccion visita) {
        this.visita = visita;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(String horaTermino) {
        this.horaTermino = horaTermino;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }
    
    
}
