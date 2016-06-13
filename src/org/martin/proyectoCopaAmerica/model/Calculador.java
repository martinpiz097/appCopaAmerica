/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.martin.proyectoCopaAmerica.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author martin
 */
public class Calculador {
    
    private static Calendar c;

    public static String getHoraActual(){
        
        c = new GregorianCalendar();
        String h = String.valueOf(c.get(Calendar.HOUR_OF_DAY));
        String m = String.valueOf(c.get(Calendar.MINUTE));
        String s = String.valueOf(c.get(Calendar.SECOND));
        
        if(Integer.valueOf(h) < 10) h = "0" + h;
        if(Integer.valueOf(m) < 10) m = "0" + m;
        if(Integer.valueOf(s) < 10) s = "0" + s;
        
        return h + ":" + m + ":" + s;
    }
    
    public static String getFechaActual(){
        
        c = new GregorianCalendar();
        String d = String.valueOf(c.get(Calendar.DAY_OF_MONTH));
        String m = String.valueOf(c.get(Calendar.MONTH)+1);
        String y = String.valueOf(c.get(Calendar.YEAR));
        
        if(Integer.valueOf(d) < 10) d = "0" + d;
        if(Integer.valueOf(m) < 10) m = "0" + m;
        
        return d + "/" + m + "/" + y;
    }
}
