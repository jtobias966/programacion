/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.github;
import java.util.*;
/**
 *
 * @author juan pablo
 */
public class PruebaGithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][]=new int [5][5];
        int i,j,ap;
        
        int sumafila=0,sumacolumna=0;
        Random azar=new Random();
       int vectorF[]= new int[5];
       for(i=0;i<5;i++)
           for(j=0;j<5;j++)
               matriz[i][j]=azar.nextInt(9);
       
        for(i=0;i<5;i++){
           for(j=0;j<5;j++){
            System.out.print(matriz[i][j]+"\t");
           }
           System.out.println();
        }
           
    for(i=0;i<5;i++){
           for(j=0;j<5;j++)
               sumafila=sumafila+matriz[i][j];
    vectorF[i]=sumafila;         
    sumafila=0;}
    
    int max=0,pos=0;
    for(ap=0;ap<5;ap++)
    if(vectorF[ap]>max){
    max=vectorF[ap];
    pos=ap;
    }
    System.out.print("el que mas vendio fue el vendedor "+pos );
    
    
    
   
    
    
    
    
    
    
    
    
    }
       
       
       
      
        
   
        // TODO code application logic here
    }
    

