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
public class Jugador {

    private int id;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private byte edad;
    private Pais nacionalidad;
    private ClubDeportivo clubDeportivo;
    private Estado estadoFisico;
    private Rol rol;
    private Posicion posicion;
    private byte dorsal;
    private byte añosJugador;
    private short goles;
    private long sueldo;
    private short atajadas;
    private byte tarjetasAmarillas;
    private byte tarjetasRojas;
    private boolean habilitado;

    public Jugador(int id, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, byte edad, Pais nacionalidad, ClubDeportivo clubDeportivo, Estado estadoFisico, Rol rol, Posicion posicion, byte dorsal, byte añosJugador, short goles, long sueldo, short atajadas, byte tarjetasAmarillas, byte tarjetasRojas, boolean habilitado) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.clubDeportivo = clubDeportivo;
        this.estadoFisico = estadoFisico;
        this.rol = rol;
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.añosJugador = añosJugador;
        this.goles = goles;
        this.sueldo = sueldo;
        this.atajadas = atajadas;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.tarjetasRojas = tarjetasRojas;
        this.habilitado = habilitado;
    }

    public Jugador(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, byte edad, Pais nacionalidad, ClubDeportivo clubDeportivo, Estado estadoFisico, Rol rol, Posicion posicion, byte dorsal, byte añosJugador, short goles, long sueldo, short atajadas, byte tarjetasAmarillas, byte tarjetasRojas, boolean habilitado) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.clubDeportivo = clubDeportivo;
        this.estadoFisico = estadoFisico;
        this.rol = rol;
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.añosJugador = añosJugador;
        this.goles = goles;
        this.sueldo = sueldo;
        this.atajadas = atajadas;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.tarjetasRojas = tarjetasRojas;
        this.habilitado = habilitado;
    }

    public Jugador(int id, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, byte edad, Pais nacionalidad, ClubDeportivo clubDeportivo, Estado estadoFisico, Rol rol, Posicion posicion, byte dorsal, byte añosJugador, short goles, long sueldo, short atajadas, byte tarjetasAmarillas, byte tarjetasRojas) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.clubDeportivo = clubDeportivo;
        this.estadoFisico = estadoFisico;
        this.rol = rol;
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.añosJugador = añosJugador;
        this.goles = goles;
        this.sueldo = sueldo;
        this.atajadas = atajadas;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.tarjetasRojas = tarjetasRojas;
    }

    public Jugador(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, byte edad, Pais nacionalidad, ClubDeportivo clubDeportivo, Estado estadoFisico, Rol rol, Posicion posicion, byte dorsal, byte añosJugador, short goles, long sueldo, short atajadas, byte tarjetasAmarillas, byte tarjetasRojas) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.clubDeportivo = clubDeportivo;
        this.estadoFisico = estadoFisico;
        this.rol = rol;
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.añosJugador = añosJugador;
        this.goles = goles;
        this.sueldo = sueldo;
        this.atajadas = atajadas;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.tarjetasRojas = tarjetasRojas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ClubDeportivo getClubDeportivo() {
        return clubDeportivo;
    }

    public void setClubDeportivo(ClubDeportivo clubDeportivo) {
        this.clubDeportivo = clubDeportivo;
    }

    public Estado getEstadoFisico() {
        return estadoFisico;
    }

    public void setEstadoFisico(Estado estadoFisico) {
        this.estadoFisico = estadoFisico;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }

    public byte getAñosJugador() {
        return añosJugador;
    }

    public void setAñosJugador(byte añosJugador) {
        this.añosJugador = añosJugador;
    }

    public short getGoles() {
        return goles;
    }

    public void setGoles(short goles) {
        this.goles = goles;
    }

    public long getSueldo() {
        return sueldo;
    }

    public void setSueldo(long sueldo) {
        this.sueldo = sueldo;
    }

    public short getAtajadas() {
        return atajadas;
    }

    public void setAtajadas(short atajadas) {
        this.atajadas = atajadas;
    }

    public byte getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public void setTarjetasAmarillas(byte tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public byte getTarjetasRojas() {
        return tarjetasRojas;
    }

    public void setTarjetasRojas(byte tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
    
}
