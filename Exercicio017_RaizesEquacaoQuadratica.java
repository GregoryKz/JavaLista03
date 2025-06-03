package dev_klaus.lista02;

import java.util.Scanner;

public class Exercicio017_RaizesEquacaoQuadratica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo de Raízes da Equação Quadrática (ax² + bx + c = 0)");

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("O valor de 'a' não pode ser zero em uma equação quadrática.");
            scanner.close();
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.printf("A equação possui uma raiz real: %.2f%n", raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("A equação possui duas raízes reais: %.2f e %.2f%n", raiz1, raiz2);
        }

        scanner.close();
    }
}
