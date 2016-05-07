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
public class laboratorio {
    
    public int idLab;
    public String descripcionLab;
    
    public laboratorio(int idL, String dl){
        
        idLab=idL;
        descripcionLab=dl;
    }

    public int getIdLab() {
        return idLab;
    }

    public void setIdLab(int idLab) {
        this.idLab = idLab;
    }

    public String getDescripcionLab() {
        return descripcionLab;
    }

    public void setDescripcionLab(String descripcionLab) {
        this.descripcionLab = descripcionLab;
    }
    
}
