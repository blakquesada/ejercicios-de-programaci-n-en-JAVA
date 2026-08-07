

package com.mycompany.mavenproject1;

import java.util.Scanner;


public class Mavenproject1 {

    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       
       int contadorHora = 0;
       int contadorMedia = 0;
       int contadorDia = 0;
       double totalRecaudado = 0;

       
        
        String placa = "";
        
      while(!placa.equalsIgnoreCase("fin")){
          
          System.out.println("enter the placa of car or the word fin");
         placa = read.nextLine();
       
         
          if (placa.equalsIgnoreCase("fin")) {
              break;
              
          }
     
         
        System.out.println("ingrese el tipo de servicio");
        System.out.println("1.for hour");
        System.out.println("2.for half a day");
        System.out.println("for day");
        int servicio = read.nextInt();
        read.nextLine(); 
        
        if (servicio ==1) {
            System.out.println("how many hour was the car");
            int horas = read.nextInt();
            read.nextLine(); 
            double costo = horas *3;
            totalRecaudado += costo;
            contadorHora++;
            
             System.out.println("his much is " + costo);
        }else if (servicio ==2) {
             
            double costo = 15 -(15 *0.05);
            totalRecaudado += costo;
            contadorMedia++;
            System.out.println("su costo fue de costo:" + costo);
              
          }else if (servicio == 3) {
              double costo = 30-( 30 * 0.10);
            totalRecaudado += costo;
            contadorDia++;
              System.out.println("su costo fue de costo:" + costo);
          }else{
              System.out.println("service not available please try later");
          }
        
         
          
      }
        System.out.println("\n--- Estadisticas finales ---");
        System.out.println("Servicios por hora: " + contadorHora);
        System.out.println("Servicios media jornada: " + contadorMedia);
        System.out.println("Servicios jornada completa: " + contadorDia);
        System.out.println("Total recaudado: $" + totalRecaudado);
      
        
    }
}
