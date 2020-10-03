/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;

/**
 *
 * @author yosua
 */
public class Usuario {

    public String identificacion;
    public String nombre;
    public String correo;
    public String telefono;
    public String direccion;
    public String sexo;
    public String fecha;
    public ArrayList<Articulo> cuentas;
    public int paquetes_recibidos;
    public String nivel;

    Usuario(String identificacion, String nombre, String correo, String telefono, String direccion, String sexo, String fecha, ArrayList<Articulo> cuentas, int paquetes_recibidos) {
        setIdentificacion(identificacion);
        setNombre(nombre);
        setCorreo(correo);
        setTelefono(telefono);
        setDireccion(direccion);
        setSexo(sexo);
        setFecha(fecha);
        setCuentas(cuentas);
        setPaquetes_recibidos(paquetes_recibidos);
        setNivel("Plata");
    }

    /**
     * @return the identificacion
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * @param identificacion the identificacion to set
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the cuentas
     */
    public ArrayList<Articulo> getCuentas() {
        return cuentas;
    }

    /**
     * @param cuentas the cuentas to set
     */
    public void setCuentas(ArrayList<Articulo> cuentas) {
        this.cuentas = cuentas;
    }

    /**
     * @return the paquetes_recibidos
     */
    public int getPaquetes_recibidos() {
        return paquetes_recibidos;
    }

    /**
     * @param paquetes_recibidos the paquetes_recibidos to set
     */
    public void setPaquetes_recibidos(int paquetes_recibidos) {
        this.paquetes_recibidos = paquetes_recibidos;
    }

    /**
     * @return the nivel
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

}
