/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A-n-Y
 */
public class TestUsuario {
    public static void main(String[] args) {
       Usuario letra=new Usuario();
        
        letra.setEdad(5);
        letra.setNombre("Ruben");
        
        System.out.println(letra.getNombre());
        System.out.println(letra.getedad());
    }
}
