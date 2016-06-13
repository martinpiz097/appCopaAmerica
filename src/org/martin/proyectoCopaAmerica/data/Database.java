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
import org.martin.proyectoCopaAmerica.model.ArbitroPartido;
import org.martin.proyectoCopaAmerica.model.CentroDeportivo;
import org.martin.proyectoCopaAmerica.model.ClubDeportivo;
import org.martin.proyectoCopaAmerica.model.Entrenador;
import org.martin.proyectoCopaAmerica.model.Estadio;
import org.martin.proyectoCopaAmerica.model.Pais;
import org.martin.proyectoCopaAmerica.model.Partido;
import org.martin.proyectoCopaAmerica.model.Posicion;
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

        Query.call("prAddAdmin", nuevo.getUsuario(), nuevo.getClave());
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

    public static LinkedList<Arbitro> getArbitros() throws SQLException{
        LinkedList<Arbitro> listadoArbitros = new LinkedList<>();
        Arbitro a;
        Pais p;
        ResultSet res = Query.select("arbitro", null, "*");
        
        while (res.next()) {            
            p = getPais(res.getByte(5));
            a = new Arbitro(res.getByte(1), res.getString(2), res.getString(3), res.getByte(4), p);
        }
        
        return listadoArbitros;
    }

    public static void addArbitroToPartido(ArbitroPartido ap){
        
        Query.call("prAddArbitroPartido", ap.getPartido().getId(), 
                ap.getArbitro().getId(), ap.getPosicion().getId());
    }
    
    public static LinkedList<ArbitroPartido> getArbitrosFromPartido(Partido partido) throws SQLException{
        
        LinkedList<ArbitroPartido> listaArbPar = new LinkedList<>();
        ArbitroPartido ap;
        Arbitro a;
        Partido p = null;
        Posicion pos;
        ResultSet res = Query.select("arbitroPartido", "idPartido = " + partido.getId(), "*");
            
        while (res.next()) {
            p = getPartido(res.getShort(2));
            a = getArbitro(res.getShort(3));
            pos = getPosicion(res.getByte(4));
            ap = new ArbitroPartido(res.getShort(1), p, a, pos);
            listaArbPar.add(ap);
        }
        return listaArbPar;
    }
    
    public static LinkedList<ArbitroPartido> getArbitrosPartidos() throws SQLException{
        
        LinkedList<ArbitroPartido> listaArbPar = new LinkedList<>();
        ArbitroPartido ap;
        Arbitro a;
        Partido p;
        Posicion pos;
        ResultSet res = Query.select("arbitroPartido", null, "*");
            
        while (res.next()) {
            p = getPartido(res.getShort(2));
            a = getArbitro(res.getShort(3));
            pos = getPosicion(res.getByte(4));
            ap = new ArbitroPartido(res.getShort(1), p, a, pos);
            listaArbPar.add(ap);
        }
        return listaArbPar;
    }

    public static void addCentroDeportivo(CentroDeportivo cd){
        Query.call("prAddCentroDeportivo", cd.getNombre(), cd.getSeleccion().getId(), cd.getDireccion());
    }
    
    public static LinkedList<CentroDeportivo> getCentrosDeportivos() throws SQLException{
        
        LinkedList<CentroDeportivo> centros = new LinkedList<>();
        CentroDeportivo cd;
        Seleccion s;
        ResultSet res = Query.select("centroDeportivo", null, "*");
        
        while (res.next()) {            
            s = getSeleccion(res.getByte(3));
            cd = new CentroDeportivo(res.getByte(1), res.getString(2), s, res.getString(4));
            centros.add(cd);
        }
        
        return centros;
    }
    
    public static void addClubDeportivo(ClubDeportivo club){
        Query.call("prAddClub", club.getNombre());
    }

    public static ClubDeportivo getClub(String nombre) throws SQLException{
        return getClubes().stream().filter((c) -> c.getNombre().equalsIgnoreCase(nombre)).findFirst().get();
    } 
    
    public static LinkedList<ClubDeportivo> getClubes() throws SQLException{
        
        LinkedList<ClubDeportivo> clubes = new LinkedList<>();
        ClubDeportivo cd;
        ResultSet res = Query.select("clubDeportivo", null, "*");
        
        while (res.next()) {
            cd = new ClubDeportivo(res.getByte(1), res.getString(2));
            clubes.add(cd);
        }
        return clubes;
    }
    
    public static void addEntrenador(Entrenador e){
        
        Query.call("prAddEntrenador", e.getRol().getId(), e.getSeleccion().getId(), e.getPrimerNombre(), 
                e.getSegundoNombre(), e.getPrimerApellido(), e.getSegundoApellido(), e.getEdad(), 
                e.getNacionalidad().getId(), e.getSueldo());
        
    }
    
    public static LinkedList<Entrenador> getEntrenadores(){
        
        LinkedList<Entrenador> entrenadores = new LinkedList<>();
        
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
