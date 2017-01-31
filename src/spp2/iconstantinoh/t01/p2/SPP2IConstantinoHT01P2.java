/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Iván Constantino Hernández
//A01411529
package spp2.iconstantinoh.t01.p2;
import java.util.Scanner;
/**
 *
 * @author ivana
 */
public class SPP2IConstantinoHT01P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        
        // Declaramos variables
        double base, altu, sup, per;
      System.out.println("Calculadora de área y perímetros");
        //Paso 1.- Pedimos los datos
        System.out.println("Introduce la base: ");
        base=kb.nextDouble();
        System.out.println("Introduce la altura: ");
        altu= kb.nextDouble();
      
        per= base+base+altu+altu;
        System.out.println("El perímetro es: "+per);
        sup= base*altu;
        System.out.println("La superficies es: "+sup);
        
        
               
    }
    
}
