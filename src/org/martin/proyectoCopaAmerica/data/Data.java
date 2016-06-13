
package org.martin.proyectoCopaAmerica.data;

import bd.Conexion;
import bd.Query;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Data {
    private Conexion connect;
    private ResultSet rs;
    
    public Data() throws SQLException{
        connect = new Conexion("localhost","dbCopaAmerica","root","");
        Query.conexion= connect;
    }    
    
    
}
