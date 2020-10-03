/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *Clase articulo que no posee acciones excepto constructor,set y gets 
 * @author Jossy Mejia
 */

public class Articulo{
    
    /**
     * Parametros de la clase articulo
     */
    String tipoArticulo;
    String fechaIngreso;
    String fechaRetiro;
    int impuesto;
    int descuentoAplicado;
     int numeroDeReferencia;
     boolean entregado; //true es entregado false es no entregado
     String descripcion;
     String remitente;
     
     /**Constructor de la clase Articulo donde se hace un set de todos los parametros
      * 
      * @param tipoArticulo
      * @param numeroDeReferencia
      * @param entregado
      * @param descripcion
      * @param remitente 
      */
    public Articulo(String tipoArticulo,int numeroDeReferencia, boolean entregado, String descripcion, String remitente) {
        this.tipoArticulo = tipoArticulo;
        this.numeroDeReferencia = numeroDeReferencia;
        this.entregado = entregado;
        this.descripcion = descripcion;
        this.remitente = remitente;
    }
    /**Constructor de la clase Articulo donde solo hace un set para fechaIngreso
     * 
     * @param fechaIngreso 
     */
    public Articulo(String fechaIngreso){
        this.fechaIngreso=fechaIngreso;
    }
    /**Constructor de la clase a Articulo donde se hace un set para el atributo fechaRetiro, impuestos y descuentoAplicado
     * 
     * @param fechaRetiro
     * @param impuesto
     * @param descuentoAplicado 
     */
    public Articulo(String fechaRetiro,int impuesto,int descuentoAplicado){
        this.fechaRetiro=fechaRetiro;
        this.impuesto=impuesto;
        this.descuentoAplicado = descuentoAplicado;
    }
    /**Constructor de la clase Articulo donde se hace un set del atributo entregado
     * 
     * @param entregado 
     */
    public Articulo(boolean entregado) {
        this.entregado = entregado;
    }
    
    /**
     * Retorna el valor del atributo fechaIngreso
     * @return fechaIngreso de tipo string
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }
    /**
     * Retorna el valor del atributo fechaRetiro
     * @return fechaRetiro de tipo string
     */
    public String getFechaRetiro() {
        return fechaRetiro;
    }
    
    /**
     * Retorna el valor del atributo impuesto
     * @return impuesto de tipo int
     */
    public int getImpuesto() {
        return impuesto;
    }
    
    /**
     * Retorna el valor del atributo descuentoAplicado
     * @return DescuentoAplicado de tipo int
     */
    public int getDescuentoAplicado() {
        return descuentoAplicado;
    }

    /**
     * Retorna el valor del atributo TipoArticulo
     * @return TipoArticulo de tipo string
     */
    public String getTipoArticulo() {
        return tipoArticulo;
    }

      /**
     * Retorna el valor del atributo NumeroDeReferencia
     * @return NumeroDeReferencia de tipo int
     */
    public int getNumeroDeReferencia() {
        return numeroDeReferencia;
    }
    
    /**
     * Retorna el valor del atributo Entregado
     * @return Entregado de tipo boolean
     */
    public boolean isEntregado() {
        return entregado;
    }
    
    /**
     * Retorna el valor del atributo descripcion
     * @return descripcion de tipo String
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * Retorna el valor del atributo Remitente
     * @return remitente de tipo String
     */
    public String getRemitente() {
        return remitente;
    }

}
