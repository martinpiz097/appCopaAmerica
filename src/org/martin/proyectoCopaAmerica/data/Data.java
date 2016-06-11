
package org.martin.proyectoCopaAmerica.data;

import bd.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.martin.proyectoCopaAmerica.model.Club;
import org.martin.proyectoCopaAmerica.model.Jugador;
import org.martin.proyectoCopaAmerica.model.*;

public class Data {
    private Conexion connect;
    private ResultSet rs;

    
    
    public Data() throws SQLException{
        connect = new Conexion("localhost","dbCopaAmerica","root","");
        Query.conexion= connect;
        
    
    }
    
    public void insertarPais(Jugador j){
        //Insertar Pais
        Query.insert("pais", j.getNombre());
        
        
    }
    
    public void insertarClub(Club c){
            //Insertar Club
        
         Query.insert("club",c.getNombre(),c.getPaisDeOrigen());
    }
    
    public void insertarEstadio(Estadio e){
        //Insertar Estadio
        Query.insert("estadio",e.getEstadio(),e.getId());
    }
    
    public void insertarPerfil(Perfil p){
        Query.insert("perfil",p.getNombre(),p.getId());
    }
    
    public void insertarFase(Fase f){
        Query.insert("fase", f.getNombre());
    }
    
    public void insertarPocision(Posicion p){
        Query.insert("posicion", p.getNombre());
    }
    public void insertarEstadio(Estado e){
        Query.insert("estado", e.getNombre());
    }
    
    public void insertarRol(Rol r){
    Query.insert("rol", r.getNombre());
    }
}
