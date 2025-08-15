/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mayorde3numeros;

/**
 *
 * @author Francisco
 */
import java.util.Scanner;
public class MayorDe3numeros {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int c = sc.nextInt();

        int mayor = a;
        if (b > mayor) mayor = b;
        if (c > mayor) mayor = c;

        System.out.println("El mayor es: " + mayor);
    }
}
