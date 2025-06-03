package dev_klaus.lista02;

import java.util.Scanner;

public class Exercicio019_Potencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo de Potência");

        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();

        System.out.print("Digite o expoente: ");
        double expoente = scanner.nextDouble();

        double resultado = Math.pow(base, expoente);

        System.out.printf("%.2f elevado a %.2f é: %.2f%n", base, expoente, resultado);

        scanner.close();
    }
}
