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

public class Ejercicio2 {

    public void elecciones() {

        String arreglo[][] = new String[8][19];
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Elecciones 2022-2024");

        System.out.println("Ingrese los Datos de las Elecciones");
        System.out.println("");
        
        System.out.println("Corriente");
        arreglo[0][0] = sc.nextLine();
        arreglo[0][1] = sc.nextLine();
        System.out.println("");
        
        System.out.println("Participante a Presidente");
        arreglo[1][2] = sc.nextLine();
        arreglo[1][2] = sc.nextLine();
        System.out.println("");
        
        System.out.println("Papeletas en Santa Barbara");
        arreglo[2][3] = sc.nextLine();
        arreglo[2][3] = sc.nextLine();
        System.out.println("");
        
        System.out.println("Papeletas en Cortes");
        arreglo[3][3] = sc.nextLine();
        arreglo[3][3] = sc.nextLine();
        System.out.println("");
         
        System.out.println("Papeletas en Francisco Morazan");
        arreglo[4][4] = sc.nextLine();
        arreglo[4][4] = sc.nextLine();
        System.out.println("");
        
        System.out.println("Papeletas en Comayagua");
        arreglo[5][5] = sc.nextLine();
        arreglo[5][5] = sc.nextLine();
        System.out.println("");
        
        System.out.println("Papeletas en Copan");
        arreglo[6][6] = sc.nextLine();
        arreglo[6][6] = sc.nextLine();
        System.out.println("");
        
        System.out.println("Papeletas en Atlandida");
        arreglo[7][7] = sc.nextLine();
        arreglo[7][7] = sc.nextLine();
        
        

        System.out.println("Corriente        Participante a Presidente        Santa Barbara      Cortes       Francisco Morazan        Comayagua          Copan         Atlantida");
    
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("");
            for (int j = 0; j < arreglo.length; j++) {
                System.out.print(arreglo[i][j] + "                       ");
            }  
            
        }

    }
      
}
