/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectametodos;
import java.util.*;
/**
 *
 * @author juan pablo
 */
public class RectaMetodos {
    public static double leer(){
        String x;
        Scanner leer=new Scanner(System.in);
        x=leer.next();
        return Double.parseDouble(x);
    }
    
    public static void imprimir(String i){
        System.out.print(i);
    }
    
    public static double pendiente(double x1, double y1 , double x2, double y2){
        
       return (y2-y1)/(x2-x1);
       
    
    }
    
    public static double interseccion(double x1, double y1, double m){
       
        return y1-m*x1;
        
    
   }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x1,y1,x2,y2,m,b;
        
        try{
        System.out.print("Ingrese x1");
        x1=leer(); 
        System.out.print("Ingrese y1");
        y1=leer();
       
        System.out.print("Ingrese x2");
        x2=leer();
        
        System.out.print("Ingrese y2");
        y2=leer();
       
      
       if(x2==x1)
            imprimir("Error");
       if(x2!=x1){
       
       
        imprimir("La Ecuacion de la recta es: Y="+ pendiente(x1,y1,x2,y2) + "X + "+interseccion(x1,y1,pendiente(x1,y1,x2,y2)) );
        }
        }
        catch(Exception e){
          
       
         imprimir("ERROR");
        
        
        }
    
        
        // TODO code application logic here
    }
    
}
