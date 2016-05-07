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
public class tarea {
    
    public int idTarea;
    public String tipoTarea;
    public String estado;
    public String descripcionTarea;
    
    public tarea(int idT, String tipot, String e, String dt){
        
        idTarea=idT;
        tipoTarea=tipot;
        estado=e;
        descripcionTarea=dt;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public String getTipoTarea() {
        return tipoTarea;
    }

    public void setTipoTarea(String tipoTarea) {
        this.tipoTarea = tipoTarea;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }
    
    
}
