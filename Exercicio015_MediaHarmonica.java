package dev_klaus.lista02;

import java.util.Scanner;

public class Exercicio015_MediaHarmonica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo de Média Harmônica");

        double[] numeros = new double[3];
        double somaInversos = 0;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o número %d: ", i + 1);
            numeros[i] = scanner.nextDouble();

            if (numeros[i] == 0) {
                System.out.println("Número não pode ser zero para cálculo da média harmônica.");
                scanner.close();
                return;
            }
            somaInversos += 1 / numeros[i];
        }

        double mediaHarmonica = 3 / somaInversos;

        System.out.printf("A média harmônica é: %.2f%n", mediaHarmonica);

        scanner.close();
    }
}
