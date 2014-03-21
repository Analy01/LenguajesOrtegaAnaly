/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A-n-Y
 */
public class Tarjeta {
    public Tarjeta() {
      nombrecliente="juan";  
    }
    
    private int numerotarjeta;
    private String nombrecliente;
    
    public void setnumerotarjeta(int numerotarjeta){
        this.numerotarjeta=numerotarjeta;
    }
    public int getnumerotarjeta(){
        return numerotarjeta;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }
}
