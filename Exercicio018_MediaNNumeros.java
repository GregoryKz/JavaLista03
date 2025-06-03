package dev_klaus.lista02;

import java.util.Scanner;

public class Exercicio018_MediaNNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo de Média de N Números");

        System.out.print("Quantos números deseja inserir? ");
        int quantidade = scanner.nextInt();

        if (quantidade <= 0) {
            System.out.println("Quantidade deve ser maior que zero.");
            scanner.close();
            return;
        }

        double soma = 0;
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Digite o número %d: ", i + 1);
            double numero = scanner.nextDouble();
            soma += numero;
        }

        double media = soma / quantidade;

        System.out.printf("A média dos %d números é: %.2f%n", quantidade, media);

        scanner.close();
    }
}
