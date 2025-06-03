package dev_klaus.lista02;

import java.util.Scanner;

public class Exercicio020_SomaDigitos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo da Soma dos Dígitos de um Número Inteiro");

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int somaDigitos = 0;
        int numeroTemp = Math.abs(numero); // para lidar com negativos

        while (numeroTemp > 0) {
            somaDigitos += numeroTemp % 10;
            numeroTemp /= 10;
        }

        System.out.printf("A soma dos dígitos de %d é: %d%n", numero, somaDigitos);

        scanner.close();
    }
}
