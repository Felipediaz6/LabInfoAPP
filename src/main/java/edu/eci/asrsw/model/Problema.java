/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.asrsw.model;

import java.util.Date;

/**
 *
 * @author felipe
 */
public class Problema {
    
    public int idProblema;
    public String descripcionProblema;
    public Date fecha;
    
    public Problema(int id, String decripcion, java.util.Date date ) {
        idProblema=id;
        descripcionProblema = decripcion;
        fecha= date;        
    }

    public int getIdProblema() {
        return idProblema;
    }

    public void setIdProblema(int idProblema) {
        this.idProblema = idProblema;
    }

    public String getDescripcionProblema() {
        return descripcionProblema;
    }

    public void setDescripcionProblema(String descripcionProblema) {
        this.descripcionProblema = descripcionProblema;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
