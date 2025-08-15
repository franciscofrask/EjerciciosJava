/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoradescuento;

/**
 *
 * @author Francisco
 */
import java.util.Scanner;
public class CalculadoraDescuento {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String cat = sc.next().toUpperCase();

        double descuento = 0;
        switch (cat) {
            case "A": descuento = 0.10; break;
            case "B": descuento = 0.15; break;
            case "C": descuento = 0.20; break;
            default:
                System.out.println("Categoría inválida.");
                return;
        }

        double precioFinal = precio - (precio * descuento);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }
}
