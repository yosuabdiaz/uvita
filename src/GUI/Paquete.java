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
public class Paquete extends Articulo {
    boolean contenidoElectronico; //true es contenido electronico, false no es electronico
    boolean fragil;                        //true el contenido es fragil, false no es fragil
    int peso;
    boolean enCaja;                     //true se entrega en caja, false se entrega en bolsa
    //Agregar el enum que aun nose como se usa o como se da el valor
    
    public Paquete() {
        super("Paquete",1, false," ", " ");
        this.contenidoElectronico=true;
        this.fragil=true;
        this.peso=1;
        this.enCaja=true;
    }
     public Paquete(String descripcion, String remitente, boolean entregado, int numeroDeReferencia) {
        super("Paquete",numeroDeReferencia, entregado,descripcion, remitente);
        this.contenidoElectronico=true;
        this.fragil=true;
        this.peso=1;
        this.enCaja=true;
    }
    
    public Paquete(String descripcion, String remitente, boolean entregado, int numeroDeReferencia,boolean contenidoElectronico,boolean fragil, int peso,boolean enCaja) {
        super("Paquete",numeroDeReferencia, entregado,descripcion, remitente);
        this.contenidoElectronico=contenidoElectronico;
        this.fragil=fragil;
        this.peso=peso;
        this.enCaja=enCaja;
    }

    public Paquete(String fechaIngreso) {
        super(fechaIngreso);
    }

    public Paquete(String fechaRetiro, int impuesto, int descuentoAplicado) {
        super(fechaRetiro, impuesto, descuentoAplicado);
    }

    
    public void setContenidoElectronico(boolean contenidoElectronico) {
        this.contenidoElectronico = contenidoElectronico;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setEnCaja(boolean enCaja) {
        this.enCaja = enCaja;
    }

    public boolean isContenidoElectronico() {
        return contenidoElectronico;
    }

    public boolean isFragil() {
        return fragil;
    }

    public int  getPeso() {
        return peso;
    }

    public boolean isEnCaja() {
        return enCaja;
    }
    
    
    public int  impuestosPaquete(){
        int impuesto;
        impuesto = (int) (peso * 0.02);
        if (fragil==true){impuesto+=2;}
        else if(contenidoElectronico==true){impuesto+=2;}
        return impuesto;
    }
    
}
    

