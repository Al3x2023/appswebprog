package edu.utvt.clase1;

import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de ciclos requeridos: ");
        int n = scanner.nextInt();

        System.out.println("\nImprimiendo el número de ciclos requeridos");

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(".");
            }
            System.out.println();
        }

        scanner.close();
    }
}
