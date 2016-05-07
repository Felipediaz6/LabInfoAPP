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
public class bitacora {
    
    public int idBitacora;
    public String descripcionBitacora;
    
    public bitacora(int idB, String db){
        
        idBitacora=idB;
        descripcionBitacora=db;
    }

    public int getIdBitacora() {
        return idBitacora;
    }

    public void setIdBitacora(int idBitacora) {
        this.idBitacora = idBitacora;
    }

    public String getDescripcionBitacora() {
        return descripcionBitacora;
    }

    public void setDescripcionBitacora(String descripcionBitacora) {
        this.descripcionBitacora = descripcionBitacora;
    }
    
    
}
