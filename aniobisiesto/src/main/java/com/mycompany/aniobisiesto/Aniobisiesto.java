/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aniobisiesto;

/**
 *
 * @author Francisco
 */
import java.util.Scanner;
public class Aniobisiesto {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int año = sc.nextInt();

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }
    }
}
