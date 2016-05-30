/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.martin.proyectoCopaAmerica.data;

import bd.Conexion;
import bd.Query;
import java.util.LinkedList;
import java.util.List;
import org.martin.proyectoCopaAmerica.model.Partido;
import org.martin.proyectoCopaAmerica.model.Seleccion;

/**
 *
 * @author martin
 */
public class Database {
   
    private static Conexion con;
    
    static{
        
        if (con == null) {
            con = new Conexion("dbCopaAmerica");
            Query.conexion = con;
        }
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
    
    public static 
    
}
