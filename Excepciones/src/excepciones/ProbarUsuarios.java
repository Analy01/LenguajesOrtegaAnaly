package excepciones;


import excepciones.Usuario;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A-n-Y
 */
public class ProbarUsuarios {
public static void main(String args[]) throws Exception{
        Usuario u=new Usuario();
        u.setNombre("Hola");
        System.out.println("Este siempre debe salir");
        u.setEdad(15);
        System.out.println("Esto en teoria si la edad es"
                + " menor de 18 NO TENDRIA QUE SALIR N-U-N-C-A");
        
    }
}
