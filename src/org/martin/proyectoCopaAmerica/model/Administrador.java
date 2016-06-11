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
    private String nick;
    private String password;

    public Administrador(byte id, String nick, String password) {
        this.id = id;
        this.nick = nick;
        this.password = password;
    }

    public Administrador(String nick, String password) {
        this.nick = nick;
        this.password = password;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
