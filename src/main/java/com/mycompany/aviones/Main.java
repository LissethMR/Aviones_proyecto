/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aviones;

import java.util.Scanner;

/**
 *
 * @author lizeth
 */
public class Main {

    public static void main(String[] args) throws Exception{
        
        Principal p = new Principal();
        p.Principal();
        int elegir;
        
        do{
            System.out.println("\n1. Disponibilidad de puestos"+"\n2. Comprar"+"\n3. Salir\n");
            System.out.print("Opcion: ");
            Scanner opcion = new Scanner(System.in);
            elegir = opcion.nextInt();

            switch(elegir){
                case 1: p.mostrarMapaAvion(); 
                    break;
                case 2: p.comprar();
                    break;
                case 3:
                    System.out.println("Fin de la compra");
                    break;
            } 
        } while(elegir !=3); 
    }
}
