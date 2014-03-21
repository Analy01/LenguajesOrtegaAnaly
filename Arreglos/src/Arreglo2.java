/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A-n-Y
 */
public class Arreglo2 {
    //Lo mismo de la clase Arreglo1 pero con ciclo for mejorado 
    public static void main(String[] args) {
       int y[]=new int[5];
	y[2]=7;

	//Probaremos que los arreglos son tratados como objetos
	for(int i:y){
            System.out.println(i);
        }
	
	} 
}
