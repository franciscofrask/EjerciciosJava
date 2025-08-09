/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.divisiontipos;

/**
 *
 * @author Francisco
 */
import java.util.Scanner;
public class DivisionTipos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = sc.nextInt();
        
        System.out.println("División int: " + (a / b));
        
        double ad = a;
        double bd = b;
        System.out.println("División double: " + (ad / bd));
    }
}
