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
public class turno {
     
    public int idTurno;
    public String dia;
    public Date horaInicio;
    public Date horaFin;
    
    
    public turno(int idT, String dia, java.sql.Date hi, java.sql.Date hf){
        
        idTurno=idT;
        this.dia=dia;
        horaInicio=hi;
        horaFin=hf;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public turno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
