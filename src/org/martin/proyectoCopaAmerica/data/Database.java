/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.martin.proyectoCopaAmerica.data;

import bd.Conexion;
import bd.Query;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.martin.proyectoCopaAmerica.model.Administrador;
import java.util.LinkedList;
import org.martin.proyectoCopaAmerica.model.Arbitro;
import org.martin.proyectoCopaAmerica.model.Estadio;
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
        
        ResultSet res = Query.select("administrador", "usuario = '" + posible.getUsuario() + 
                "' && clave = '" + posible.getClave() + "'", "*");
        
        boolean isValido = res.next();
        res.close();
        return isValido;
    }
    
    public static void addAdmin(Administrador nuevo) throws SQLException{
        
        if(getAdmin(nuevo.getUsuario()) != null) return;
        
        Query.insert("administrador", nuevo.getUsuario(), nuevo.getClave());
    }

    public static LinkedList<Administrador> getAdmins(Administrador nuevo) throws SQLException{
        
        LinkedList<Administrador> administradores = new LinkedList<>();
        ResultSet res = Query.select("administrador", null, "*");
        
        while (res.next())             
            administradores.add(new Administrador(res.getByte(1), res.getString(2), res.getString(3)));
        
        return administradores;
    }

    public static Administrador getAdmin(String usuario) throws SQLException{
        
        Administrador resultado;
        ResultSet res = Query.select("administrador", "usuario = '" + usuario + "'", "usuario", "clave");
        return resultado = new Administrador(res.getString(1), res.getString(2));
//        if (con == null) {
//            // con = new Conexion("prueba", Conexion.);
//            Query.conexion = con;
//        }
    }
    
    public static void addArbitro(Arbitro nuevo){
        
        Query.call("prAddArbitro", nuevo.getNombre(), nuevo.getApellido(), 
                nuevo.getEdad(), nuevo.getNacionalidad().getId());
    }

    
    
    public static void addPartido(Partido p){
        Query.insert("partido", p.getFecha(), p.getLocal().getId(), p.getVisita().getId(), 
                p.getEstadio().getId(), p.getHoraInicio(), p.getHoraTermino(), p.getCantidadAsistentes());
    }
    
    public static LinkedList<Partido> getPartidos() throws SQLException{
        
        LinkedList<Partido> partidos = new LinkedList();
        Partido p;
        Seleccion l, v;
        Estadio e;
        ResultSet res = Query.select("partido", null, "*");
        
        while (res.next()) {            
            
            l = getSeleccion(res.getByte(3));
            v = getSeleccion(res.getByte(4));
            e = getEstadio(res.getByte(5));
            p = new Partido(res.getShort(1), res.getString(2), l, v, e, res.getString(6), 
                    res.getString(7), res.getInt(8));
            
            partidos.add(p);
        }
        
        return partidos;
    }
    
    public static Partido getPartido(Seleccion local, Seleccion visita, String fecha) throws SQLException{
        
        Partido resultado = null;
        ResultSet res = Query.select("partido", "seleccionLocal = " + local.getId() + " and seleccionVisita = " + 
                visita.getId() + " and fecha = '" + fecha + "'", "*");
        Seleccion l, v;
        Estadio e;
        
        if (res.next()) {
            
            l = getSeleccion(res.getByte(3));
            v = getSeleccion(res.getByte(4));
            e = getEstadio(res.getByte(5));
            resultado = new Partido(res.getShort(1), res.getString(2), l, v, e, res.getString(6), 
                    res.getString(7), res.getInt(8));
        }
        
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
