/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumnumpares;

/**
 *
 * @author Francisco
 */
import java.util.Scanner;
public class SumNumPares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int num;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            num = sc.nextInt();
            if (num % 2 == 0 && num != 0) {
                suma += num;
            }
        } while (num != 0);

        System.out.println("La suma de los números pares es: " + suma);
    }
}
