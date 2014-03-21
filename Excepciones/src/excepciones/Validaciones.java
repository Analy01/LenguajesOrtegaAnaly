package excepciones;


import excepciones.EdadNegativaException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A-n-Y
 */
public class Validaciones {
public static void validarEdad(int edad)throws EdadNegativaException{
        if(edad<18)throw new EdadNegativaException();
    }
}
