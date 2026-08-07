
package com.mycompany.recordtemperature;

import java.util.Scanner;


public class RecordTemperature {

    public static void main(String[] args) {
        double temperatura [] = new double[7];
        Scanner read = new Scanner (System.in);
        double suma = 0;
    
    
        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("ingrese la temperatura de la semana");
            temperatura[i] = read.nextDouble();
            suma  = (suma + temperatura[i]);
                 
        }
        double promedio = suma / temperatura.length;
        
        double maxima = temperatura[0];
        int posMax = 0 ;
         for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i] > maxima) {
                maxima =temperatura[i];
                posMax= i;
                
            }
            
      
}
         System.out.println("la temperatura mas alta de la semana fue:" + maxima);
         System.out.println("la temperatura promedio fue de:" + promedio);
         
    
    
    }
    
}
