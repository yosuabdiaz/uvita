/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author yosua
 */
public class Counter {
    private String nombre;
    private String cedula;
    private String numero_casilleros;
    private String direccion;
    
    Counter(String nombre,String cedula,String numero_casilleros,String direccion){
        setNombre(nombre);
        setCedula(cedula);
        setNumero_casilleros(numero_casilleros);
        setDireccion(direccion);
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
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the numero_casilleros
     */
    public String getNumero_casilleros() {
        return numero_casilleros;
    }

    /**
     * @param numero_casilleros the numero_casilleros to set
     */
    public void setNumero_casilleros(String numero_casilleros) {
        this.numero_casilleros = numero_casilleros;
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
    
}
