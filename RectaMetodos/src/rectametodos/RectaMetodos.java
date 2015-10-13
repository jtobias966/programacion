/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectametodos;
import java.util.*;
import java.text.DecimalFormat;
/**
 *
 * @author juan pablo
 */
public class RectaMetodos {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x1,y1,x2,y2;
        
        try{
             x1=ingresarPuntoX1();
             y1=ingresarPuntoY1();
             x2=ingresarPuntoX2();
             y2=ingresarPuntoY2();
      
            if(x2==x1){
                imprimir("ERROR: x1 es igual a x2");
                System.out.println();
                RectaMetodos.main(args);
            }
                
            if(x2!=x1){
                ecuacion(x1,y1,x2,y2);
            }
       
            }
        catch(Exception e){
            
            imprimir("ERROR: Ingrese un número");
            System.out.println();
            RectaMetodos.main(args);
            
            
        }
    
        
        // TODO code application logic here
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
    
    public static double ingresarPuntoX1(){
       String p;
       System.out.print("ingrese x1: ");
       Scanner leer= new Scanner(System.in);
       p=leer.next();
       return Double.parseDouble(p);      
    }
    
    public static double ingresarPuntoY1(){
       String p;
       System.out.print("ingrese y1: ");
       Scanner leer= new Scanner(System.in);
       p=leer.next();
       return Double.parseDouble(p);
    }
    
    public static double ingresarPuntoX2(){
       String p;
       System.out.print("ingrese x2: ");
       Scanner leer= new Scanner(System.in);
       p=leer.next();
       return Double.parseDouble(p);
    }
    public static double ingresarPuntoY2(){
       String p;
       System.out.print("ingrese y2: ");
       Scanner leer= new Scanner(System.in);
       p=leer.next();
       return Double.parseDouble(p);
    }
    public static void ecuacion(double x1, double y1, double x2, double y2){
       DecimalFormat df = new DecimalFormat("0.0");
       System.out.print("La Ecuacion de la recta es: Y="+ df.format(pendiente(x1,y1,x2,y2))
               +"x+ "+df.format(interseccion(x1,y1,pendiente(x1,y1,x2,y2))));
       
   }
   
}
