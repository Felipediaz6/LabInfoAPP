/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.asrsw.model;

/**
 *
 * @author felipe
 */
public class equipo {
    
    public int idEquipo;
    public String descripcionEquipo;
    
    public equipo(int idE, String descE){
        
        idEquipo=idE;
        descripcionEquipo=descE;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getDescripcionEquipo() {
        return descripcionEquipo;
    }

    public void setDescripcionEquipo(String descripcionEquipo) {
        this.descripcionEquipo = descripcionEquipo;
    }
   
    
}
