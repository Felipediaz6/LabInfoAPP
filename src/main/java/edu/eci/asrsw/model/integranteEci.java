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
public class integranteEci {
    
    public int numCarne;
    public String nombre;
    public String apellido;
    public String email;
    public boolean esEstudiante;
    public boolean esMonitor;
    public boolean esProfesor;
    
    public integranteEci(int nCarne, String n, String a, String e, boolean isE, boolean isM, boolean isP){
        
        numCarne=nCarne;
        nombre=n;
        apellido=a;
        email=e;
        esEstudiante=isE;
        esMonitor=isM;
        esProfesor=isP;
    }
    
     public integranteEci() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumCarne() {
        return numCarne;
    }

    public void setNumCarne(int numCarne) {
        this.numCarne = numCarne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEsEstudiante() {
        return esEstudiante;
    }

    public void setEsEstudiante(boolean esEstudiante) {
        this.esEstudiante = esEstudiante;
    }

    public boolean isEsMonitor() {
        return esMonitor;
    }

    public void setEsMonitor(boolean esMonitor) {
        this.esMonitor = esMonitor;
    }

    public boolean isEsProfesor() {
        return esProfesor;
    }

    public void setEsProfesor(boolean esProfesor) {
        this.esProfesor = esProfesor;
    }
     
    
}
