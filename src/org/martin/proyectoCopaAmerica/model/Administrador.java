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
public class Administrador {

    private byte id;
    private String usuario;
    private String clave;

    public Administrador(byte id, String usuario, String clave) {
        this.id = id;
        this.usuario = usuario;
        this.clave = clave;
    }

    public Administrador(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
