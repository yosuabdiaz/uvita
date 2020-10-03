/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the te`mplate in the editor.
 */
package GUI;

/**
 *
 * @author yosua
 */
public class Casillero {

    /**
     *
     */
    public int numero;

    /**
     *
     */
    public Usuario usuario;
    private Counter counter;
    Casillero(int numero,Usuario usuario){
        setNumero(numero);
        setUsuario(usuario);
       
    }
    Casillero(int numero,Counter counter){
        setNumero(numero);
         setCounter(counter);
    }

    /**
     *
     * @return
     */
    public int getNumero() {
        return numero;
    }

    /**
     *
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     *
     * @return
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     *
     * @param usuario
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the counter
     */
    public Counter getCounter() {
        return counter;
    }

    /**
     * @param counter the counter to set
     */
    public void setCounter(Counter counter) {
        this.counter = counter;
    }
    
}
