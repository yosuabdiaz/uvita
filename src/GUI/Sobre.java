/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.Articulo;

/**
 *
 * @author Jossy Mejia
 */
public class Sobre extends Articulo {
    boolean tipoManilla; //true es tipo manilla false es tipo aereo
    boolean contenidoDocumento; //true el contenido es documento, false no es documento
    float peso;
    
    public Sobre() {
        super("Sobre",1, false," ", " ");
        this.tipoManilla=true;
        this.contenidoDocumento=true;
        this.peso=1;
    }
     public Sobre(String descripcion, String remitente, boolean entregado, int numeroDeReferencia) {
        super("Sobre",numeroDeReferencia, entregado,descripcion, remitente);
        this.tipoManilla=true;
        this.peso=1;
        this.contenidoDocumento=true;
    }
    
    public Sobre(String descripcion, String remitente, boolean entregado, int numeroDeReferencia,float peso,boolean contenidoDocumento,boolean tipoManilla) {
        super("Sobre",numeroDeReferencia, entregado,descripcion, remitente);
        this.tipoManilla=tipoManilla;
        this.peso=peso;
        this.contenidoDocumento=contenidoDocumento;
    }

    public Sobre(String fechaIngreso) {
        super(fechaIngreso);
    }

    public Sobre(String fechaRetiro, int impuesto, int descuentoAplicado) {
        super(fechaRetiro, impuesto, descuentoAplicado);
    }

    
    public boolean isTipoManilla() {
        return tipoManilla;
    }

    public void setTipoManilla(boolean tipoManilla) {
        this.tipoManilla = tipoManilla;
    }

    public boolean isContenidoDocumento() {
        return contenidoDocumento;
    }

    public void setContenidoDocumento(boolean contenidoDocumento) {
        this.contenidoDocumento = contenidoDocumento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    public int impuestosSobre(){
        int impuesto=0;
        if (tipoManilla==true){
             if (contenidoDocumento == true){ impuesto += 1;} 
             else {impuesto += 2;} }
        else if (tipoManilla == false && contenidoDocumento==false){impuesto+=1;}
        return impuesto;
    }
}
