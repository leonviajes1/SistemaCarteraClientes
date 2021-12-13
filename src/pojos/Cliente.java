/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

/**
 *
 * @author leonv
 */
public class Cliente {
    
    int id;
    
    //Datos Personales
    String nombre;
    String direccion;
    String pais;
    String correo;
    int telefono;
    int codigoPostal;
   
    
    // Datos del cliente
    String tipoCliente; //Frecuente, Esporadico
    String puesto;
    String nombreEmpresa;
    String giro;
    String observaciones;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String direccion, String pais, String correo, int telefono, int codigoPostal, String tipoCliente, String puesto, String nombreEmpresa, String giro, String observaciones) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.pais = pais;
        this.correo = correo;
        this.telefono = telefono;
        this.codigoPostal = codigoPostal;
        this.tipoCliente = tipoCliente;
        this.puesto = puesto;
        this.nombreEmpresa = nombreEmpresa;
        this.giro = giro;
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    
    
    
}
