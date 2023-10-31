/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Acceso_a_Datos.VisitaData;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author carol
 */
public class Mascota {
    private int idMascota;
    private String nombre;
    private String sexo;
    private String especie;
    private String raza;
    private String color;
    private double peso;
    private LocalDate fechaNac;
    private Cliente cliente;
    private boolean activo;

    public Mascota() {
    }

    public Mascota(int idMascota, String nombre, String sexo, String especie, String raza, String color, double peso, LocalDate fechaNac, Cliente cliente, boolean activo) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.peso = peso;
        this.fechaNac = fechaNac;
        this.cliente = cliente;
        this.activo = activo;
        
    }

    public Mascota(String nombre, String sexo, String especie, String raza, String color, double peso,LocalDate fechaNac, Cliente cliente, boolean activo) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.peso = peso;
        this.fechaNac = fechaNac;
        this.cliente = cliente;
        this.activo = activo;
    }


    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    public double pesoActual(){
        
       VisitaData visita = new VisitaData();
       List<Visita>ultimaVisita = visita.obtenerVisitasXmascota(idMascota);
       Visita vis = ultimaVisita.get(ultimaVisita.size()-1);
       peso = vis.getPesoActual();
        
        return peso;
    }
    

    @Override
    public String toString() {
        return ""+ idMascota ;
    }

   
    
    
    
}
