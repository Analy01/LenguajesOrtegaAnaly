/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package capitulo5_;


public class PrimerThread implements Runnable{
    public static void main(String[] args) {
//1.creado
        Runnable r=new PrimerThread();
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);
        t1.setName("primero");
        t2.setName("segundo");
        t3.setName("tercero");
//2.inicializacion
       t1.start();
       t2.start();
       t3.start();
        
    }
//3.en ejecucion
    public void run() {
        try {
            if(Thread.currentThread().getName().equals("primero"))Thread.sleep(1000);
            if(Thread.currentThread().getName().equals("segundo"))Thread.sleep(1000);
            if(Thread.currentThread().getName().equals("tercero"))Thread.sleep(1000);
            
            System.out.println("Soy un thread  "+ Thread.currentThread().getName());
        } catch (InterruptedException ex) {
        }
    }
//5.termina su ejecucion
    
}