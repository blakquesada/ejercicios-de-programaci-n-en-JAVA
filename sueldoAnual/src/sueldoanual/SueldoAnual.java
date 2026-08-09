
package sueldoanual;

import java.util.Scanner;


public class SueldoAnual {

   
    public static void main(String[] args) {
        double  sueldo [] = new double [12]; 
        Scanner read = new Scanner (System.in);
        
        double sumaTotal =0;
       
        
        
        for (int i = 0; i < sueldo.length; i++) {
            System.out.println("ingrese su sueldo " + (i+1));
            sueldo[i] = read.nextDouble();
            
             sumaTotal = sumaTotal + sueldo[i];
           
             
             System.out.println("sueldo mensual fue de: " + sueldo[i]);
        }
        double  promedio = sumaTotal  / sueldo.length;
        
       
        
        System.out.println("============== info de su sueldo en todo el año=============");
        System.out.printf("su sueldo al año fue: $%.2f%n", sumaTotal);
        System.out.printf("promedio de ingresos es de: $%.2f%n", promedio);
    }
    
}
