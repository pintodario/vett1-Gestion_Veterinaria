/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Maxi
 */

    
 
public class Cliente {
    private int ID_cliente;
    private int dni;
    private String nombre;
    private String apellido;
    private int telefono;
    private String direccion;
    private int contactoAlternativo;
    private String NombreContactoAlt;
    private boolean activo;

    public Cliente() {
    }

    public Cliente(int ID_cliente, int dni, String nombre, String apellido, int telefono, String direccion, int contactoAlternativo, String NombreContactoAlt, boolean activo) {
        this.ID_cliente = ID_cliente;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.contactoAlternativo = contactoAlternativo;
        this.NombreContactoAlt = NombreContactoAlt;
        this.activo = activo;
    }

    public Cliente(int dni, String nombre, String apellido, int telefono, String direccion, int contactoAlternativo, String NombreContactoAlt, boolean activo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.contactoAlternativo = contactoAlternativo;
        this.NombreContactoAlt = NombreContactoAlt;
        this.activo = activo;
    }

    public int getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(int ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getContactoAlternativo() {
        return contactoAlternativo;
    }

    public void setContactoAlternativo(int contactoAlternativo) {
        this.contactoAlternativo = contactoAlternativo;
    }

    public String getNombreContactoAlt() {
        return NombreContactoAlt;
    }

    public void setNombreContactoAlt(String NombreContactoAlt) {
        this.NombreContactoAlt = NombreContactoAlt;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

   
 
}


   