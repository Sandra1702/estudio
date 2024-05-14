/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tortola_interface;

/**
 *
 * @author Usuario
 */
public class Tortola_interface {

    /**
     * todo esto es lo que muestra, va a mostrar el metodo volar de las dos clases
     * @param args 
     */
    public static void main(String[] args) {
       
        /**
         * hace un objeto de la clase rata voladora y llama al metodo
         */
        RataVoladora fiufiu = new RataVoladora();
        fiufiu.volar();
        
        /**
         * hace un objeto de la clase dodoVolador y llama al metodo
         */
        DodoVolador Mafia = new DodoVolador();
        Mafia.volar();
        
    }
}
