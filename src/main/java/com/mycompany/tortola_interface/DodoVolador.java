/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tortola_interface;


/**
 * implementa la interfaz de PalomaInterface que lo que hace es que los metodos
 * que tiene en la interfaz los tienen que tener las clases que lleven la interfaz obligatoriamente
 * y ademas pueden tener otros metodos cada clase
 * @author Usuario
 */
public class DodoVolador implements PalomaInterface {
    /**
     * una variable
     */
    String tipo_pico;
            
    /**
     * constructor vacio
     */
            public DodoVolador(){
                
            }
            
            /**
             * le va a devolver un double
             * @return 
             */
             public double cagar(){
                 return 0.9999;
             }
    
             /**
              * muestra un sout poniendo why fly?
              */
    public void volar(){
        System.out.println("why fly?");
    }
    
    
}
