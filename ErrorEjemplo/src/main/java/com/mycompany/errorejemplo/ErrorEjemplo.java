/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.errorejemplo;

/**
 *
 * @author Francisco
 */
import java.util.Scanner;
public class ErrorEjemplo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // Cambiado nextInt() por nextLine()
        System.out.println("Hola, " + nombre);
    }
}
