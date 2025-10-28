package main.java.tp8.excepcion;

import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        ejemploDivision();
    }
    
    public static void ejemploDivision() {
        // Ejemplos predeterminados
        System.out.println("Ejemplos de división segura:");
        
        // Caso 1: División normal
        try {
            int resultado1 = 10 / 2;
            System.out.println("10 ÷ 2 = " + resultado1);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Caso 2: División por cero
        try {
            int resultado2 = 10 / 0;
            System.out.println("10 ÷ 0 = " + resultado2);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida - " + e.getMessage());
        }
        
        // Caso 3: División con decimales
        try {
            double resultado3 = 7.0 / 3.0;
            System.out.println("7.0 ÷ 3.0 = " + resultado3);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void divisionInteractiva() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese dividendo: ");
            int a = sc.nextInt();
            System.out.print("Ingrese divisor: ");
            int b = sc.nextInt();

            try {
                int r = a / b;
                System.out.println("Resultado: " + r);
            } catch (ArithmeticException e) {
                System.out.println("Error: división por cero no permitida.");
            }
        }
    }
}