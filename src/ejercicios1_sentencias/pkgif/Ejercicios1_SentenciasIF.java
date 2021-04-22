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

        //Ejercicio 1    
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

        int nume1 = 13, nume2 = 45;
        if (nume1 < nume2) {

            System.out.println("El número mayor es: " + nume2);

            System.out.println("El número menor es: " + nume1);
        } else {

            System.out.println("El número mayor es: " + nume1);

            System.out.println("El número menor es: " + nume2);
        }

        //Ejercicio 3
        //3.- Lea dos números e indique cuál es el mayor, cuál es el menor y en su caso decir si son iguales.
        System.out.println("EJERCICIO 3");
        int numero1 = 1;
        int numero2 = 1;

        if (numero1 < numero2 && numero1 != numero2) {
            System.out.println("El número mayor es: " + numero2);
            System.out.println("El número menor es: " + numero1);
        }

        if (numero1 > numero2 && numero1 != numero2) {
            System.out.println("El número mayor es: " + numero1);
            System.out.println("El número menor es: " + numero2);
        }

        if (numero1 == numero2) {
            System.out.println("Los números son iguales");
        }

        
        //Ejercicio 4
        // 4.- Escriba un programa que con base al año actual y lea un año cualquiera 
        //y que escriba cuántos años han pasado desde ese año o cuántos años faltan para llegar a ese año
        
        System.out.println("EJERCICIO 4");
        int añoact = 2021;
        int añoant = 1976;
        int resta;
        resta = añoact - añoant;

        System.out.println("Desde " + añoant + " hasta " + añoact + " han pasado " + resta + " año");

        //Ejercicio 5
        //5.- En este reto deberás programar un código que solicite al usuario que introduzca un número,
        //lo asigne a una variable, compruebe si el número es positivo (mayor o igual que cero) en cuyo
        //caso imprimirá por la consola el mensaje "Es positivo", en caso contrario imprimirá el mensaje "Es negativo".
        
        System.out.println("EJERCICIO 5");
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un número:");
        numero = teclado.nextInt();
        if (numero > 0 && numero != 0) {
            System.out.println("El número es positivo");
        }
        if (numero < 0 && numero != 0) {
            System.out.println("El número es negativo");
        }
        if (numero == 0) {
            System.out.println("El número es cero");
        }

        //Ejercico 6
        //6.- Compruebe si el número  tecleado tiene dos cifras (números comprendidos entre 10 y 99)
        //en cuyo caso imprimirá por la consola el mensaje "Tiene dos cifras", en caso contrario imprimirá el mensaje "Distinto de dos cifras". 
        System.out.println("EJERCICIO6");
        int numer;
        System.out.println("Ingrese un número: ");
        numer = teclado.nextInt();
        if (numer < 10 && numer > 0) {
            System.out.println("El número es distinto de dos cifra");
        }
        if (numer <= 99 && numer >= 10) {
            System.out.println("El número tiene dos cifras");
        }

    }
}
