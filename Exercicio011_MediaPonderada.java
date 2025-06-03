package dev_klaus.lista02;

import java.util.Scanner;

public class Exercicio011_MediaPonderada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo de Média Ponderada");

        double[] notas = new double[3];
        double[] pesos = new double[3];
        double somaPesos = 0;
        double somaNotasPesadas = 0;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite a nota %d: ", i + 1);
            notas[i] = scanner.nextDouble();

            System.out.printf("Digite o peso da nota %d: ", i + 1);
            pesos[i] = scanner.nextDouble();

            somaPesos += pesos[i];
            somaNotasPesadas += notas[i] * pesos[i];
        }

        if (somaPesos == 0) {
            System.out.println("A soma dos pesos não pode ser zero.");
        } else {
            double mediaPonderada = somaNotasPesadas / somaPesos;
            System.out.printf("A média ponderada é: %.2f%n", mediaPonderada);
        }

        scanner.close();
    }
}
