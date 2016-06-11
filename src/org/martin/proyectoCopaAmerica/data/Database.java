/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.martin.proyectoCopaAmerica.data;

import bd.Conexion;
import bd.Query;
import java.io.IOException;
import java.net.Socket;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.martin.proyectoCopaAmerica.model.Administrador;
import org.martin.proyectoCopaAmerica.model.Partido;
import org.martin.proyectoCopaAmerica.model.Seleccion;

/**
 *
 * @author martin
 */
public class Database {
   
    private static Conexion con;
    
    static{
        
        try {
            con = new Conexion("localhost", "dbCopaAmerica", "root", "admin");
            Query.conexion = con;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public static boolean loginValido(Administrador posible) throws SQLException{
        
        ResultSet res = Query.select("administrador", "nick = '" + posible.getNick() + 
                "' && password = '" + posible.getPassword() + "'", "*");
        
        boolean isValido = res.next();
        res.close();
        return isValido;
    }
    
    public static void addAdmin(Administrador nuevo) throws SQLException{
        
        if (getAdmin(nuevo.getNick()) != null) return;
        
        Query.insert("administrador", nuevo.getNick(), nuevo.getPassword());
    }

    public static LinkedList<Administrador> getAdmins(Administrador nuevo) throws SQLException{
        
        LinkedList<Administrador> administradores = new LinkedList<>();
        ResultSet res = Query.select("administrador", "habilitado = 1", "*");
        
        while (res.next())             
            administradores.add(new Administrador(res.getByte(1), res.getString(2), res.getString(3)));
        
        return administradores;
    }

    public static Administrador getAdmin(String nick) throws SQLException{
        
        Administrador resultado;
        ResultSet res = Query.select("administrador", "nick = '" + nick + "'", "nick", "clave");
        return resultado = new Administrador(res.getString(1), res.getString(2));
    }
    
    public static void addPartido(Partido p){
        
    }
    
    public static LinkedList<Partido> getPartidos(){
        
        LinkedList<Partido> partidos = new LinkedList();
        
        return partidos;
    }
    
    public static Partido getPartido(Seleccion local, Seleccion visita){
        
        Partido resultado = new Partido();
        
        return resultado;
    }
    
    public static void addSeleccion(Seleccion s){
        
    }
    
    public static LinkedList<Seleccion> getSelecciones() throws SQLException{
        
        LinkedList<Seleccion> selecciones = new LinkedList<>();
        ResultSet res = Query.select("seleccion", null, "*");
        Seleccion s = new Seleccion();
        
        while (res.next()) {            
            
            
        }
        
        return selecciones;
    }
}
