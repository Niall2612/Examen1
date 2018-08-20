/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenip;

/**
 *
 * @author Hosanna
 */
import java.util.Scanner;
public class Ejercicio1 {
    public void numeros(){
      
        int[] array = new int [1];
        int valor = 0;
      
      Scanner sc = new Scanner (System.in);
      
        System.out.println("Ingrese un numero" );
        valor = sc.nextInt();
        
        for (int i = 0; i < 50; i++) {
            if (valor < 50) {
                System.out.println("Esta cerca");
                
                
            }else{
                System.out.println("Acerto!!!!");
            }
            
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i]);
        }
            
            return;
        }
        
        
    }
    
}
