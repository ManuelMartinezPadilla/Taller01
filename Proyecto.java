package Ejercicios;

import java.util.Scanner;

public class Proyecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creación de un objeto Libro
        System.out.println("Ingrese título del libro:");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese autor del libro:");
        String autor = scanner.nextLine();
        System.out.println("Ingrese número de páginas:");
        int paginas = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        Libro libro = new Libro(titulo, autor, paginas);

        // Creación de un objeto CuentaBancaria
        System.out.println("Ingrese número de cuenta bancaria:");
        String numeroCuenta = scanner.nextLine();
        System.out.println("Ingrese tipo de cuenta bancaria:");
        String tipoCuenta = scanner.nextLine();
        System.out.println("Ingrese saldo inicial:");
        double saldo = scanner.nextDouble();
        scanner.nextLine();
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);

        // Creación de un objeto Estudiante
        System.out.println("Ingrese nombre del estudiante:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese edad del estudiante:");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese curso del estudiante:");
        String curso = scanner.nextLine();
        Estudiante estudiante = new Estudiante(nombre, edad, curso);

        // Mostrar detalles
        System.out.println("\nDetalles de los objetos creados:");
        System.out.println(libro);
        System.out.println(cuenta);
        System.out.println(estudiante);

        scanner.close();
    }
}