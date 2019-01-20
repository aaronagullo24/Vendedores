/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrong;

import static armstrong.Armstrong.esArmstrong;



/**
 *
 * @author Aaron
 */
public class Ejer03Res04 {
    public static void main(String[] args){
       
       System.out.println("------LOS NUMEROS ARMSTRONG SON-------");
       
        for(int numero=100;numero<1000;numero++){
            if (esArmstrong(numero)== 1){
                
                System.out.println("\033[32m E1 "+numero+" es Armstrong");
            }  
                  
}
}
}


