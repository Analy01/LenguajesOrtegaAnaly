/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A-n-Y
 */
public class Usuario {
    private String Nombre;
    private int edad;
    
  public String getNombre(){
        return Nombre;
      
  }  
  public int getedad(){
        return edad;
      
  }
  public void setNombre(String Nombre){
      this.Nombre=Nombre;
      
  }
  public void setEdad(int edad){
  if(edad<18)edad=18;
  this.edad=edad;
  }
}
