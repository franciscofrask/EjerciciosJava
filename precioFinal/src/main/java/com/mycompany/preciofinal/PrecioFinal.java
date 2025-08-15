/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.preciofinal;

/**
 *
 * @author Francisco
 */
import java.util.Scanner;
public class PrecioFinal {

     public static double calcularPrecioFinal(double precioBase, double impuestoPct, double descuentoPct) {
        double impuesto = precioBase * (impuestoPct / 100.0);
        double descuento = precioBase * (descuentoPct / 100.0);
        return precioBase + impuesto - descuento;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = sc.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje (Ej: 10 para 10%): ");
        double impuesto = sc.nextDouble();
        System.out.print("Ingrese el descuento en porcentaje (Ej: 5 para 5%): ");
        double descuento = sc.nextDouble();

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("El precio final del producto es: " + precioFinal);
    }
}
