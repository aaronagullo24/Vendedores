/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrong;

/**
 *
 * @author Aaron
 */
public class Armstrong {
   
    
     public static int esArmstrong( int numero){
        
        int pos1 = numero/100;
        int pos2 = (numero-100*pos1)/10;
        int pos3 = numero-100*pos1 - 10*pos2;
        int dato = potencia(pos1,3)+potencia(pos2,3)+potencia(pos3,3);  
       if (numero == dato) return 1;
        return 0;
  }
     
    public static int potencia(int base, int exponente){
        
        int res = base;
        for(int i=0;i<exponente-1;i++){
            res = res * base;
        }
        return res;
    }
   
 

}
  
 
     





    
   