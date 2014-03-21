/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A-n-Y
 */
public class Imagen {
    private int alto;
    private int ancho;
    
public int getAlto(){
     return alto;
    }
public int getAncho() {
        return ancho;
    }

public void setAlto(int alto){
        if(alto<0) {
        alto=-alto;
    }
        this.alto=alto;
        System.out.println("El alto es de: " +alto+ "");
}

public void setAncho(int ancho) {
        if(ancho<0) {
        ancho=-ancho;
    }
        this.ancho = ancho;
        System.out.println("El ancho es de: " +ancho+ "");
    }
}
