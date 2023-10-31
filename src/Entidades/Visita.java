/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author carol
 */
public class Visita {
    
    private int ID_visita;
    private Mascota ID_mascota;
    private Tratamiento ID_tratamiento;
    private String detalle;
    private LocalDate fechaVisita;
    private double pesoActual;
   

    public Visita() {
    }

    public Visita(int ID_visita, Mascota ID_mascota, Tratamiento ID_tratamiento, String detalle, LocalDate fechaVisita, double pesoActual) {
        this.ID_visita = ID_visita;
        this.ID_mascota = ID_mascota;
        this.ID_tratamiento = ID_tratamiento;
        this.detalle = detalle;
        this.fechaVisita = fechaVisita;
        this.pesoActual = pesoActual;
    }

    public Visita(Mascota ID_mascota, Tratamiento ID_tratamiento, String detalle, LocalDate fechaVisita, double pesoActual) {
        this.ID_mascota = ID_mascota;
        this.ID_tratamiento = ID_tratamiento;
        this.detalle = detalle;
        this.fechaVisita = fechaVisita;
        this.pesoActual = pesoActual;
    }

    public int getID_visita() {
        return ID_visita;
    }

    public void setID_visita(int ID_visita) {
        this.ID_visita = ID_visita;
    }

    public Mascota getID_mascota() {
        return ID_mascota;
    }

    public void setID_mascota(Mascota ID_mascota) {
        this.ID_mascota = ID_mascota;
    }

    public Tratamiento getID_tratamiento() {
        return ID_tratamiento;
    }

    public void setID_tratamiento(Tratamiento ID_tratamiento) {
        this.ID_tratamiento = ID_tratamiento;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public LocalDate getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(LocalDate fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

   

   
    
}
    

