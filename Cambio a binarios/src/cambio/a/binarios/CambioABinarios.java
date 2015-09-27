/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambio.a.binarios;
import java.util.*;
/**
 *
 * @author juan pablo
 */
public class CambioABinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int NumDec;
        int Binario[]=new int [8];
        int i;
        int aux=0;
        Scanner leer=new Scanner(System.in);
        
        System.out.print("ingrese el numero que desea transformar a binario");
        NumDec=leer.nextInt(); 
        if(NumDec>=0 && NumDec<256){
        for(i=0;i<8;i++){
            Binario[i]=NumDec%2;
        NumDec=NumDec/2;
        }
        
        for(i=0;i<4;i++){
           aux = Binario[(7-i)];
           Binario[(7-i)] = Binario[i];
           Binario[i] = aux;
           
        }
        
        
        System.out.print("El numero en binario es:");
        for(i=0;i<8;i++)
            System.out.print(Binario[i]);
      
        }else{System.out.print("Error");}
        
        
        
            
        
        
        
        // TODO code application logic here
    }
    
}
