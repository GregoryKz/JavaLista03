package dev_klaus.lista02;

import java.util.Scanner;

public class Exercicio016_MediaGeometrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo de Média Geométrica");

        double[] numeros = new double[3];
        double produto = 1;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o número %d: ", i + 1);
            numeros[i] = scanner.nextDouble();
            produto *= numeros[i];
        }

        double mediaGeometrica = Math.pow(produto, 1.0 / 3);

        System.out.printf("A média geométrica é: %.2f%n", mediaGeometrica);

        scanner.close();
    }
}
