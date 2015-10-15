/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.*;
/**
 *
 * @author juan pablo
 */
public class Calculadora {

    public static void PerArVol(){
     Scanner leer=new Scanner(System.in);
    int opcion,funcion;
    double a,b,c,area,perimetro,volumen;
   //Menu inicial
    System.out.println("¿Que desea hacer?");
    System.out.println("1 - AREA");
    System.out.println("2 - PERIMETRO");
    System.out.println("3 - VOLUMEN");
    
    try{
    do{
    System.out.println("Ingrese la opcion (1,2,3)");
    funcion=leer.nextInt(); //leer opcion ingresada
    }while(funcion<1 || funcion>3);
    //casos segun funcion ingresada
    switch(funcion){
        case 1:{
            
            System.out.println("¿A que desea calcular el AREA?");
            System.out.println("1- Cuadrado");
            System.out.println("2- Triangulo");
            System.out.println("3- Circulo");
            System.out.println("4- Esfera");
            System.out.println("5- Cubo");
            System.out.println("6- Cono");
            do{
            opcion=leer.nextInt();
            if(opcion<1 || opcion>6)
                System.out.println("Ingrese valores validos");
            }while(opcion<1 || opcion>6);
            //if segun opciones
            if(opcion==1){
                System.out.println("Ingrese lado 1");
                a=leer.nextDouble();
                area=a*a;
                System.out.println("El area es: "+area);
            }
            if(opcion==2){
                System.out.println("Ingrese Base");
                a=leer.nextDouble();
                System.out.println("Ingrese altura");
                b=leer.nextDouble();
                area=(a*b)/2;
                System.out.println("El area es: "+area);
            }
            if(opcion==3){
                System.out.println("Ingrese Radio");
                a=leer.nextDouble();
                area=(a*a)*Math.PI;
                System.out.println("El area es: "+area);
            }if(opcion==4){
                System.out.println("Ingrese radio");
                a=leer.nextDouble();
                area=4*Math.PI*(a*a);
                System.out.println("El area es: "+area);
            }
            if(opcion==5){
                System.out.println("Ingrese lado");
                a=leer.nextDouble();    
                area=6*a;
                System.out.println("El area es: "+area);
            }
            if(opcion==6){
                System.out.println("Ingrese Radio");
                a=leer.nextDouble();
                System.out.println("Ingrese Generatriz");
                b=leer.nextDouble();
                area=((a*a)*Math.PI)+(Math.PI*a*b);
                System.out.println("El area es: "+area);
            }
                break;
            }   
        case 2:
        {
            System.out.println("¿A que desea calcular el PERIMETRO?");
            System.out.println("1- Cuadrado");
            System.out.println("2- Triangulo");
            System.out.println("3- Circulo");
            do{
            opcion=leer.nextInt();
            if(opcion<1 || opcion>3)
                System.out.println("Ingrese valores validos");
            }while(opcion<1 || opcion>3);
            //if segun opcion
            if(opcion==1){//perimetro cuadrado
                System.out.println("Ingrese lado 1");
                do{
                a=leer.nextDouble();
                }while(a<0);
                perimetro=4*a;
                System.out.println("El perimetro es: "+perimetro);
            }
            if(opcion==2){//perimetro triangulo
                System.out.println("Ingrese lado 1");
                do{
                a=leer.nextDouble();
                }while(a<0);
                System.out.println("Ingrese lado 2");
                do{
                b=leer.nextDouble();
                }while(a<0);
                System.out.println("Ingrese lado 3");
                do{
                c=leer.nextDouble();
                }while(a<0);
                perimetro=a+b+c;
                System.out.println("El area es: "+perimetro);
            }
            if(opcion==3){//perimetro circulo
                System.out.println("Ingrese Radio");
                do{
                a=leer.nextDouble();
                }while(a<0);
                perimetro=2*a*Math.PI;
                System.out.println("El area es: "+perimetro);
            }
                break;
            }
            
        case 3:
        {    
            System.out.println("¿A que desea calcular el VOLUMEN?");
            System.out.println("1- Esfera");
            System.out.println("2- Cubo");
            System.out.println("3- Cono");
            do{
            opcion=leer.nextInt();
            if(opcion<1 || opcion>3)
                System.out.println("Ingrese valores validos");
            }while(opcion<1 || opcion>3);
            
            if(opcion==1){//volumen esfera
                System.out.println("Ingrese radio");
                do{
                a=leer.nextDouble();
                }while(a<0);
                volumen=(a*a*a)*Math.PI*4/3;
                System.out.println("El area es: "+volumen);
            }
            if(opcion==2){//volumen cubo
                System.out.println("Ingrese lado");
                do{
                a=leer.nextDouble();
                }while(a<0);
                volumen=a*a*a;
                System.out.println("El area es: "+volumen);
            }
            if(opcion==3){//volumen cono
                System.out.println("Ingrese Radio");
                do{
                a=leer.nextDouble();
                }while(a<0);
                do{
                System.out.println("Ingrese altura");
                b=leer.nextDouble();
                }while(b<0);
                volumen=(a*a)*Math.PI*b/3;
                System.out.println("El area es: "+volumen);
            }
                break;
            }
    }
    }
    catch(Exception e){
        System.out.println("Error");
    }
    
    }
    
    public static void EcRecta (){
    
    double x1,y1,x2,y2,m,b;
        Scanner leer = new Scanner(System.in);
        try{
        System.out.print("Ingrese x1");
        x1=leer.nextDouble(); 
        System.out.print("Ingrese y1");
        y1=leer.nextDouble();
       
        System.out.print("Ingrese x2");
        x2=leer.nextDouble();
        
        System.out.print("Ingrese y2");
        y2=leer.nextDouble();
       
      
       if(x2==x1)
            System.out.println("Error");
       if(x2!=x1){
       m=(y2-y1)/(x2-x1);
       b=y1-m*x1;
       System.out.print("La Ecuacion de la recta es: Y="+ m + "X + "+b );}
      }
      catch(Exception e){
          
       
          System.out.println("ERROR");
        
        
                }
    }
    
    public static int leer(){
        String x;
        Scanner leer=new Scanner(System.in);
        x=leer.next();
        return Integer.parseInt(x);
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Op;
        
        System.out.println("¿Qué operacion desea realizar?");
        System.out.println("1.Obtener la Ecuación de la recta dados dos puntos");
        System.out.println("2.Obtener el área, perímetro o volúmen");
        try{
        Op=leer();
        switch (Op){
            case 1:{EcRecta();}
            case 2:{PerArVol();}
      
        }
        
        }catch(Exception e){System.out.print("Ingrese uno de los numeros del menú");
        }
        
        
        
        
        // TODO code application logic here
    }
    
}
