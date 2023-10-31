/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dario
 */
public class Tratamiento {

    private int ID_tratamiento;
    private String descripcion;
    private String medicamento;
    private double importe;
    private String tipoTratamiento;
    private boolean activo;

    public Tratamiento() {
    }

    public Tratamiento(int ID_tratamiento, String descripcion, String medicamento, double importe, String tipoTratamiento, boolean activo) {
        this.ID_tratamiento = ID_tratamiento;
        this.descripcion = descripcion;
        this.medicamento = medicamento;
        this.importe = importe;
        this.tipoTratamiento = tipoTratamiento;
        this.activo = activo;
    }

    public Tratamiento(String descripcion, String medicamento, double importe, String tipoTratamiento, boolean activo) {
        this.descripcion = descripcion;
        this.medicamento = medicamento;
        this.importe = importe;
        this.tipoTratamiento = tipoTratamiento;
        this.activo = activo;
    }

    public int getID_tratamiento() {
        return ID_tratamiento;
    }

    public void setID_tratamiento(int ID_tratamiento) {
        this.ID_tratamiento = ID_tratamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getTipoTratamiento() {
        return tipoTratamiento;
    }

    public void setTipoTratamiento(String tipoTratamiento) {
        this.tipoTratamiento = tipoTratamiento;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "" + ID_tratamiento ;
    }

  

}
