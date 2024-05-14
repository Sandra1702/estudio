/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tortola_interface;

/**
 *implementa la interfaz de la PalomaInterface
 * @author Usuario
 */
public class RataVoladora  implements PalomaInterface{
    
    String raza;

public RataVoladora(){};

public double cagar(){
    return 23984938;
}

public void volar(){
    System.out.println("i can fly!!");
}
}
