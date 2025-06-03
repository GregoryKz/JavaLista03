package dev_klaus.lista02;

import java.util.Scanner;

public class Exercicio012_JurosCompostos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo de Juros Compostos");

        System.out.print("Digite o capital inicial (R$): ");
        double capitalInicial = scanner.nextDouble();

        System.out.print("Digite a taxa de juros anual (em %): ");
        double taxaJurosAnual = scanner.nextDouble();

        System.out.print("Digite o número de anos: ");
        int anos = scanner.nextInt();

        double montante = capitalInicial * Math.pow(1 + taxaJurosAnual / 100, anos);

        System.out.printf("O montante final após %d anos é: R$ %.2f%n", anos, montante);

        scanner.close();
    }
}
