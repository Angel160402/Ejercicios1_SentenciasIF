/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios1_sentencias.pkgif;

import java.util.Scanner;

/**
 *
 * @author Ángel Hidalgo
 */
public class Ejercicios1_SentenciasIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //1.- Lea dos números e indique cuál es el mayor de ambos
        System.out.println("EJERCICIO 1");

        int num1 = 10, num2 = 4;

        if (num1 > num2) {

            System.out.println("El número mayor es: " + num1);
        }
        if (num2 > num1) {
            System.out.println("El número menor es: " + num2);

        }

        //Ejercicio 2
        //2.- Lea dos números e indique cuál es el mayor y cuál es el menor de ambos.
     
        System.out.println("EJERCICIO 2");
        
        int nume1 = 500, nume2 = 100;
        if (nume1 < nume2) {
            
            System.out.println("2.El numero mayor es: " + nume2);
            
            System.out.println("2.El numero menor es: " + nume1);
        } else {
            
            System.out.println("2.El numero mayor es: " + nume1);
           
            System.out.println("2.El numero menor es: " + nume2);
        }
    }

}
